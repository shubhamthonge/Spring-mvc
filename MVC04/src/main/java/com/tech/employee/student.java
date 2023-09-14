package com.tech.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.service.studentService;

@Controller
public class student {

	public student() {
	System.out.println("inside employee constructor");
		}
	@Autowired
	studentService studentService;
	
	@RequestMapping("/updateStudent")
	public String studentupdate() {
		studentService.updateStudent();
		return "updateStudent";
	}
	
	@RequestMapping("/createstudent")
	public String createStudent() {
		studentService.createStudent();
		return "createstudent";
	} 
}