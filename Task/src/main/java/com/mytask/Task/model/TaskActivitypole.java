package com.mytask.Task.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Activitypole")

public class TaskActivitypole {
	@Id
	String id;
	String Label;
	String Address;
	Number Phone;
	String Responsible_name;
	String Responsible_email;
	String Nb_Licence;
	Date Expiration_date;
	
	public TaskActivitypole(String Label , String Address, Number Phone, String Responsible_name, String Responsible_email,String Nb_Licence, Date Expiration_date )
	{
		this.Label=Label;
		this.Address=Address;
		this.Phone=Phone;
		this.Responsible_name=Responsible_name;
		this.Responsible_email= Responsible_email;
		this.Nb_Licence=Nb_Licence;
		this .Expiration_date=Expiration_date;
		
		
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Number getPhone() {
		return Phone;
	}
	public void setPhone(Number phone) {
		Phone = phone;
	}
	public String getResponsible_name() {
		return Responsible_name;
	}
	public void setResponsible_name(String responsible_name) {
		Responsible_name = responsible_name;
	}
	public String getResponsible_email() {
		return Responsible_email;
	}
	public void setResponsible_email(String responsible_email) {
		Responsible_email = responsible_email;
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


