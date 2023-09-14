package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.dto.student;
import com.tech.service.loginservice;
import com.tech.service.studentsrevice;

@Controller
public class logincontroller {
	
	public logincontroller() {
		System.out.println("inside logincontroller constructo");
	}
	@Autowired
	loginservice loginservice;
	
	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("uname")String username,@RequestParam("pass")String password) {
		
		boolean result=loginservice.login(username,password);
		
		if(result) {
			ModelAndView mvc=new ModelAndView("success");
			mvc.addObject("user1",username);
			return mvc;
		}else {
			ModelAndView mvc=new ModelAndView("failuer");
			mvc.addObject("user1",username);
			return mvc;
		}
	}
		

		
	
}
