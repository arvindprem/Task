package com.mytask.Task.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "user")
public class Taskuser {
	@Id
	String id;
	String name;
	String Last_name;
	Date Expiration_date;
	
	public Taskuser() {}
	public Taskuser( String name, String Last_name, Date Expiration_date )
{
	
	this .name=name;
	this .Last_name=Last_name;
	this .Expiration_date=Expiration_date;

}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLast_name() {
		return Last_name;
	}


	public void setLast_name(String last_name) {
		Last_name = last_name;
	}


	public Date getExpiration_date() {
		return Expiration_date;
	}


	public void setExpiration_date(Date expiration_date) {
		Expiration_date = expiration_date;
	}
}


	
	
