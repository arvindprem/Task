package com.mytask.Task.model;

import java.util.Date;

public class TaskSurvey {

	String id;
	String version;
	Date creation_date;
	String Download_path;
	
	public TaskSurvey() {}
	public TaskSurvey(String version,
	Date creation_date,
	String Download_path) {
		this.creation_date=creation_date;
		this.Download_path=Download_path;
		this.version=version;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getCretion_date() {
		return creation_date;
	}
	public void setCretion_date(Date cretion_date) {
		this.creation_date = cretion_date;
	}
	public String getDownload_path() {
		return Download_path;
	}
	public void setDownload_path(String download_path) {
		Download_path = download_path;
	}

}
