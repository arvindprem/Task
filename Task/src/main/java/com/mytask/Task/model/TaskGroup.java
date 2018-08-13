package com.mytask.Task.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Group")

public class TaskGroup {
	
	@Id
	String id;
	String Label;
	String Nb_Licence;
	Date Expiration_date;
	
	public TaskGroup(String Label,String Nb_Licence,Date Expiration_date)
	{
		this.Label=Label;
		this.Nb_Licence= Nb_Licence;
		this.Expiration_date=Expiration_date;
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
	public String getNb_Licence() {
		return Nb_Licence;
	}
	public void setNb_Licence(String nb_Licence) {
		Nb_Licence = nb_Licence;
	}
	public Date getExpiration_date() {
		return Expiration_date;
	}
	public void setExpiration_date(Date expiration_date) {
		Expiration_date = expiration_date;
	}

}
