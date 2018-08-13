package com.mytask.Task.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data


@AllArgsConstructor
public class TaskSurvey {
@Id
	String id;
	String version;
	Date creation_date;
	String Download_path;
	
}
