package com.mytask.Task.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytask.Task.model.Taskuser;
import com.mytask.Task.repository.Taskrepository;
@RestController
@RequestMapping("")
public class Taskcontoller {
	@Autowired
	private Taskrepository repository;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<User> getallTaskuser() 
	{
		return repository.findAll();
	}

	@RequestMapping(value="/{id}" ,method= RequestMethod.GET)
	public  getTaskuserbyid(@PathVariable("id") Object id) {
	return (Taskuser) repository .findByid(id);
}
}