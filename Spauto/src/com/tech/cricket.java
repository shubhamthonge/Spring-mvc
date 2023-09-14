package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class cricket {

	private String name;
	
	@Autowired
	@Qualifier("a1")
	private team team;
	
	public cricket() {
		System.out.println("inside the cons cricket");
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
