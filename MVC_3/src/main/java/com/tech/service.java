package com.tech;

import org.springframework.stereotype.Controller;


@Controller
public class service {

	public service() {
	System.out.println("inside service cons");
	}
	
	public boolean validate(String username,String password)  {
		
		logindoe logindoe=new logindoe();
		boolean validate=logindoe.validate( username,password);
		System.out.println(validate);
		return validate;
	}
}
