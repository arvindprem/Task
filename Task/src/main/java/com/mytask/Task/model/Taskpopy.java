package com.mytask.Task.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data


@AllArgsConstructor
public class Taskpopy {
	@Id
	String id;
	String Version;
	Date Creation_date;
	String Download_path;
	
	
	
}


