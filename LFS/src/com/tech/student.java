package com.tech;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class student {
	
	private String name;
	
	
	public student() {
		System.out.println("inside student cons");
	}

	public void setName(String name) {
		System.out.println("inside set name");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("inside init method");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("inside destroy method");
	}
}
