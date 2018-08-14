package com.mytask.Task.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface Taskrepository extends MongoRepository<User, String>{
	
	List<User> findByid(String id);

	@Query("{'TaskActivitypole.Label.Address.Expiration_date','Tasksociety.Label.Address.Expiration_date','TaskPoppyFeature.Label','TaskSurvey.Label': ?0}")
	
	
	List<User> findByLabel(String Label);
	List<User> findByAdress(String Adress);
}
