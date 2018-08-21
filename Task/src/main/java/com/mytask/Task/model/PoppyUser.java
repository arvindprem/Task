package com.mytask.Task.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor

@Document(collection= "Poppy client database")
public class PoopyUser {
	@Id
	private String id;
	private String name;
	private String Last_name;
	private Date Expiration_date;
	
	
}


	
	
