package com.mytask.Task.repository;
import com.mytask.Task.model.PoppyUser;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<PoppyUser, String> {

	PoppyUser findByEmail(String email);
}
