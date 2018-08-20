package com.mytask.Task.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytask.Task.model.PoopyUser;
import com.mytask.Task.repository.Taskrepository;
@RestController
@RequestMapping("")
public class Taskcontoller {
	@Autowired
	private Taskrepository repository;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<User> getallPoppyuser() 
	{
		return repository.findAll();
	}

	@RequestMapping(value="/{id}" ,method= RequestMethod.GET)
	public  PoopyUser getPoppyUserbyid(@PathVariable("id") String id) {
	return (PoopyUser) repository .findByid(id);
}
}