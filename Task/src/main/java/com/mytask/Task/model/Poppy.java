package com.mytask.Task.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data


@AllArgsConstructor
@Document(collection= "poppy")
public class Poppy {
	
	String Version;
	Date Creation_date;
	String Download_path;
	@DBRef
	private List<PoppyUser>Poppyuser_id; 
	
	
}


