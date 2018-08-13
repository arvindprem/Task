package com.mytask.Task.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="poppy")

public class Taskpopy {
	@Id
	String id;
	String Version;
	Date Creation_date;
	String Download_path;
	
	public Taskpopy() {}
	
	public Taskpopy(String Version, Date creation_date, String Download_path)
	{
		this.Version=Version;
		this.Creation_date=creation_date;
		this.Download_path=Download_path;
	}

	
	public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getVersion() {
	return Version;
}
public void setVersion(String version) {
	Version = version;
}
public Date getCreation_date() {
	return Creation_date;
}
public void setCreation_date(Date creation_date) {
	Creation_date = creation_date;
}
public String getDownload_path() {
	return Download_path;
}
public void setDownload_path(String download_path) {
	Download_path = download_path;
}
	
	
}


