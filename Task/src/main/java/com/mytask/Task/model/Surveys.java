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

@Document(collection= "surveys")
public class Surveys{
	@Id
	private String id;
	private String 	Version;
	private Date 	Creation_DateTime;
	private String	DownloadPath;

	@DBRef
	private List<PoppyUser>PoppyUser_id; 
}