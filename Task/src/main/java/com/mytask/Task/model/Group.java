package com.mytask.Task.model;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data


@AllArgsConstructor
public class Group{
	


@Id
private String id;
private String Label;
private String Nb_Licence;
private Date Expiration_date;
@DBRef
private List<Society>Society_id;
}