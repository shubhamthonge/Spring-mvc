package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tech.dao.logindao;
@Service
public class loginservice {

	public loginservice() {
		System.out.println("inside loginservice constructor ");
	}
	@Autowired
	logindao logindao;
	
	public boolean login(String username, String password) {
		boolean validate= logindao.login(username, password);
		return validate;
	}
}
