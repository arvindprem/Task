package com.mytask.Task.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

@AllArgsConstructor

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
	
	
}


