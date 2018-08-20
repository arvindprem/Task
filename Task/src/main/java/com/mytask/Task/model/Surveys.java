package com.mytask.Task.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data


@AllArgsConstructor
public class Surveys{
	@Id
	private String id;
	private String 	Version;
	private Date 	Creation_DateTime;
	private String	DownloadPath;

	@DBRef
	private List<PoopyUser>PoppyUser_id; 
}