package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.tech.doe.logindoe;



@Service
public class service {

	public service() {
		System.out.println("inside StudentService controller ");
	}

	public boolean validate(String username,String password) {
		logindoe logindoe=new logindoe();
		boolean validate= logindoe.validate(username,password);
		System.out.println(validate);
		return validate;
	}
}



