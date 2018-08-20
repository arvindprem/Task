package com.mytask.Task.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface Taskrepository extends MongoRepository<User, String>{
	
	List<User> findByid(String id);

	@Query("{'ActivityPole.id','Society.id','Poppyfeature.id','Surveys.id','Continent.id','Country.id,'Group.id','PoppyUser.id': ?0}")
	
	
	
	List<User> findByAdress(String Adress);
}
