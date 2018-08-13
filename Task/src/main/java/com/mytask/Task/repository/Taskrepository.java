package com.mytask.Task.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Taskrepository extends MongoRepository<User, String>{
	
	List<User> findByid(String id);

}
