package com.mytask.Task.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mytask.Task.model.PoppyUser;

public interface Taskrepository extends MongoRepository<User, String>{
	
	

	@Query("{'ActivityPole.id','Society.id','Poppyfeature.id','Surveys.id','Continent.id','Country.id,'Group.id','PoppyUser.id': ?0}")
	PoppyUser findbyid(String id);
	
	void delete(PoppyUser deleted);
	
	void save(PoppyUser user);

	void add(PoppyUser user);

}

