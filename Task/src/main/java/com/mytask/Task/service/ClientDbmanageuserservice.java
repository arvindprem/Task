package com.mytask.Task.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
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
	    return UserRepository.findByemail(email);
	}
	public void saveUser(PoppyUser user) {
	    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	    user.setEnabled(true);
	    Role userRole = roleRepository.findbyrole("ADMIN");
	    user.setRoles(new HashSet<>(Arrays.asList(userRole)));
	    userRepository.save(user);
	}
}
