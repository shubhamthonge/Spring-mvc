package com.tech.doe;

import org.springframework.stereotype.Repository;

@Repository
public class logindoe {

	public logindoe() {
	System.out.println("inside logindoe constructor");	
	}
	
	public boolean validate(String username, String password) {
		
		if (username.equals("shub")&& password.equals("shu159")){
			
			System.out.println("data present in DB");
			return true;
			
		}else{
			System.out.println("data absent in DB");
			return false;
		}
		
		
	}
}
