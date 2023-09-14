package com.tech.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.service.service;

@Controller
public class student {

	public student() {
	System.out.println("inside StudentController construtor");
	}
	
	@Autowired
	service service;
	
	@RequestMapping("/getALL")
	public String getAll()
	{
		service.getALL();
		
		return "student-getall";
	}
	@RequestMapping("/update")
	public String updateStduent()
	{
		service.updateStudent();
		return "student-update";
		
	}
}

