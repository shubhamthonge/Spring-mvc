package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class kabadi {
  
	private String	name;
	
	@Autowired
	@Qualifier(value="a")
	private team team;
	
	public kabadi() {
		System.out.println("inside the const kabadi");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public team getTeam() {
		return team;
	}
	
	
	
}
