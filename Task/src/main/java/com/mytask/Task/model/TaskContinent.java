package com.mytask.Task.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Continent")
public class TaskContinent {
@Id
	
	String id;
	
	String Label;
	
	public  TaskContinent(){}
	
	public TaskContinent(String Label)
	{
		this.Label=Label;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
}

