package com.mytask.Task.model;

import java.util.Date;
import java.util.Set;

import javax.management.relation.Role;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor

@Document(collection= "user")
public class PoppyUser {
	@Id
	private String id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
	private String name;
	private String Last_name;
	private String email;
	private String password;
	private Date Expiration_date;
	private boolean enabled;
	@DBRef
	private Set<Role> roles;
	
}


	
	
