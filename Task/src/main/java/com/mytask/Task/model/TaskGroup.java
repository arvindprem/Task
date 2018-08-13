package com.mytask.Task.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data


@AllArgsConstructor

public class TaskGroup {
	
	@Id
	String id;
	String Label;
	String Nb_Licence;
	Date Expiration_date;
	
}
