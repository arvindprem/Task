package com.mytask.Task.model;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor
@Document(collection= "activitypole")
public class ActivityPole{
	
	@Id
	private String id;
	private String Label;
	private String Address;
	private Number Phone;
	private String Responsible_name;
	private String Responsible_email;
	private String Nb_Licence;
	private Date Expiration_date;
	@DBRef
	private List<PoppyUser>Poppyuser_id; 
}

