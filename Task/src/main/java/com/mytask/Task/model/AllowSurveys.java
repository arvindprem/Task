package com.mytask.Task.model;


import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data

@AllArgsConstructor
@Document(collection= "allowsurveys")
public class AllowSurveys{
	@Id
	private String id;
	private String Filter;
	private Date Expiration_date;
	private String Sample;
	@DBRef
	private List<ActivityPole>ActivityPole_id;
	
}

