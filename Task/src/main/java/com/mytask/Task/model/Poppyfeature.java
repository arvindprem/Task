package com.mytask.Task.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data


@AllArgsConstructor
public class Poppyfeature{
	@Id
	private String id;
	
	private String Label;
	
	@DBRef
	private List<ActivityPole>ActivityPole_id;
	
}

