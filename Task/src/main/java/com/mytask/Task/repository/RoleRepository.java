package com.mytask.Task.repository;
import com.mytask.Task.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RoleRepository extends MongoRepository<Role, String> {
	
Role findbyrole(String role);
	
	
}
