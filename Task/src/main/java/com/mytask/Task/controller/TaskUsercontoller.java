package com.mytask.Task.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mytask.Task.model.PoppyUser;
import com.mytask.Task.repository.Taskrepository;
@RestController
@RequestMapping("/Poppy client database")
public class TaskUsercontoller {
	@Autowired
	private Taskrepository Taskrepository;
	
	@RequestMapping(value="/Poppy client database",method=RequestMethod.GET)
	public List<User> getallPoppyuser() 
	{
		return Taskrepository.findAll();
	}
	

	@RequestMapping(method=RequestMethod.GET, value="/Poppy client database/{id}")
    public PoppyUser show(@PathVariable String id) {
		
        return Taskrepository.findbyid( id) ;
		}
	

	@RequestMapping(method=RequestMethod.POST, value="/Poppy client database/{id}")
    public @ResponseBody PoppyUser addPoppyUser(@PathVariable String id, @RequestBody PoppyUser user) {
        Taskrepository.add(user);

        return user;
    }
	@RequestMapping(method=RequestMethod.PUT, value="/Poppy client database/{id}")
    public @ResponseBody PoppyUser updatePoppyUser(@PathVariable String id, @RequestBody PoppyUser user)  {
        PoppyUser p = Taskrepository.findbyid(id);
        if(user.getName() != null)
            p.setName(user.getName());
        if(user.getLast_name() != null)
            p.setLast_name(user.getLast_name());
        if(user.getExpiration_date() != null)
            p.setExpiration_date(user.getExpiration_date());
        
        Taskrepository.save(p);
        return user;
    }
  
	@RequestMapping(method=RequestMethod.DELETE, value="/Poppy client database/{id}")
    public @ResponseBody void delete(@PathVariable String id) {
      PoppyUser user = Taskrepository.findbyid(id);
        Taskrepository.delete(user);

        return;
    }
}
