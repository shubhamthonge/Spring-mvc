package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.doe.StudentDao;

@Service
public class studentService {

	public studentService() {
		System.out.println("inside studentService constructor");	
		}
	
	@Autowired
	StudentDao StudentDao;
     
	public String  updateStudent() {
		System.out.println("inside studentService updateStudent()");
		StudentDao. updateStudent();
		return "update";
	}
	
	@Autowired
	StudentDao StudentDao2;
	
	public void createStudent() {
	System.out.println("inside studentService createStudent()");
	 StudentDao2.createStudent();
	}
	
}


