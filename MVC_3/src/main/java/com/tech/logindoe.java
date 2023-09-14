package com.tech;

import org.springframework.stereotype.Controller;

@Controller
public class logindoe {

	public logindoe() {
		System.out.println("inside into logindeo");
	}
	
	public boolean validate(String username,String password) {
		
		if(username.equals("shubham")&& password.equals("shu111")) {
			System.out.println("Student data present in DB");
			return true;
			
		}else {
			System.out.println("Student data not present in DB");
			return  false;
		}
	}
}
