package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/login")
	public ModelAndView validate()
	{
		
		System.out.println("inside validate method");
		ModelAndView mav = new ModelAndView("success");
		return mav;
	}
}