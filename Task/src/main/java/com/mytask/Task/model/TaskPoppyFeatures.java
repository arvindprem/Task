package com.mytask.Task.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TaskPoppyFeatures")
public class TaskPoppyFeatures {
	@Id
	String id;
	
	String Label;
	
	public TaskPoppyFeatures() {}
	
	public TaskPoppyFeatures(String Label) {
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
