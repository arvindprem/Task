package com.mytask.Task.model;


import java.util.Date;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data


@AllArgsConstructor
public class Allowsurveys<Person> {
	
	@Id
	String id;
	String Filter;
	Date Expiration_date;
	String Sample;
	
	
    
   
    
    
}
