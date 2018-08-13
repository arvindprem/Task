package com.mytask.Task.model;


import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Allow survey")
public class Allowsurveys<Person> {
	
	@Id
	String id;
	String Filter;
	Date Expiration_date;
	String Sample;
	public Allowsurveys() {}
    public Allowsurveys(String Filter, Date Expiration_date, String Sample ) {
    	this.Filter=Filter;
    	this.Expiration_date=Expiration_date;
    	this.Sample=Sample;
    	
    }
    List<Person> Surveys = User.stream()
    	    .filter(p -> p.getAge() > 16).collect(Collectors.toList());
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilter() {
		return Filter;
	}

	public void setFilter(String filter) {
		Filter = filter;
	}

	public Date getExpiration_date() {
		return Expiration_date;
	}

	public void setExpiration_date(Date expiration_date) {
		Expiration_date = expiration_date;
	}

	public String getSample() {
		return Sample;
	}

	public void setSample(String sample) {
		Sample = sample;
	}
}
