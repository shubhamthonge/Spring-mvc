package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tech.dao.dao;

@Service
public class service {

	public service() {
		System.out.println("inside studentService constructor");	
		}
	
	@Autowired
	dao dao;
	public void getALL() {
		System.out.println("inside StudentService.getALL() ");
		dao.getALL();
	}

     
	public String  updateStudent() {
		System.out.println("inside studentService updateStudent()");
		dao. validate(null, null);
		return "update";
	}
}