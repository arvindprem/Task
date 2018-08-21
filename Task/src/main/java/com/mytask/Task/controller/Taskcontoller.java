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
public class Taskcontoller {
	@Autowired
	private Taskrepository Taskrepository;
	
	@RequestMapping(value="/Poppy client database",method=RequestMethod.GET)
	public List<User> getallPoppyuser() 
	{
		return Taskrepository.findAll();
	}
	

	@RequestMapping(method=RequestMethod.GET, value="/Poppy client database/{id}")
    public PoppyUser show(@PathVariable String id) {
        return Taskrepository.findone( id) {
		}
    

	@RequestMapping(method=RequestMethod.POST, value="/Poppy client database")
    public PoppyUser save(@RequestBody PoppyUser user) {
        Taskrepository.save(user);

        return user;
    }
	@RequestMapping(method=RequestMethod.PUT, value="/Poppy client database/{id}")
    public void update(@PathVariable("id") String id, @RequestBody PoppyUser user)  {
        PoppyUser p = Taskrepository.findone(id);
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
    public void delete(@PathVariable("id") String id) {
      PoppyUser user = Taskrepository.findone(id);
        Taskrepository.delete(user);

        return "";
    }
}
}