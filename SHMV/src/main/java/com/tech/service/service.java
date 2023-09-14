package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tech.doe.dao;

@service
public class service {

	public service() {
		System.out.println("inside studentService constructor");	
		}
	
	@Autowired
	dao StudentDao;
     
	public String  updateStudent() {
		System.out.println("inside studentService updateStudent()");
		StudentDao. validate(null, null);
		return "update";
	}