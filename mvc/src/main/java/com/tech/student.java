package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class student {

	
	public student() {
		System.out.println("inside consr");
		}
	
	@RequestMapping("/login")
	public ModelAndView validate()
	{
	System.out.println("inside validate method");
	ModelAndView mav = new ModelAndView("success");
	return mav;
     }


	}


