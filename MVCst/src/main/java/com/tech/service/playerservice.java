package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.deo.playerdeo;;

@Service
public class playerservice {
 
	public playerservice() {
		System.out.println("inside playerservice cons");
	}
	
	@Autowired
	playerdeo playerdeo;
	
	public boolean login(String username, String password) {
		boolean validate= playerdeo.login(username, password);
		return validate;
	}
}
