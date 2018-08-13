package com.mytask.Task.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor

@Document(collection= "Poppy client database")
public class Taskuser {
	@Id
	String id;
	String name;
	String Last_name;
	Date Expiration_date;
	
	
}


	
	
