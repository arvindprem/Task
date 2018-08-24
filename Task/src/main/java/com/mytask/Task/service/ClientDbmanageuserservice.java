package com.mytask.Task.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mytask.Task.model.PoppyUser;
import com.mytask.Task.model.Role;
import com.mytask.Task.repository.RoleRepository;
import com.mytask.Task.repository.UserRepository;

@Service
public class ClientDbmanageuserservice implements PoppyUserdetailservice {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public PoppyUser findPoppyUserByEmail(String email) {
	    return userRepository.findByEmail(email);
	}
	public void saveUser(PoppyUser user) {
	    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	    user.setEnabled(true);
	    Role userRole = roleRepository.findbyrole("ADMIN");
	    user.setRoles(new HashSet<>(Arrays.asList(userRole)));
	    userRepository.save(user);
	}
	public UserDetails loadPoppyUserByUsername(String email) throws UsernameNotFoundException {

	    PoppyUser user = userRepository.findByEmail(email);
	    if(user != null) {
	        List<GrantedAuthority> authorities = getPoppyUserAuthority(user.getRoles());
	        return buildUserForAuthentication(user, authorities);
	    } else {
	        throw new UsernameNotFoundException("username not found");
	    }
	    }
	    
		private List<GrantedAuthority> getPoppyUserAuthority(Set<Role> userRoles) {
	        Set<GrantedAuthority> roles = new HashSet<>();
	        userRoles.forEach((role) -> {
	            roles.add(new SimpleGrantedAuthority(role.getRole()));
	        });

	        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
	        return grantedAuthorities;
	    }
		private UserDetails buildUserForAuthentication(PoppyUser user, List<GrantedAuthority> authorities) {
		    return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
		}
}
