package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class create {

	public create() {
		System.out.println("inside create cons");
	}
	
	@RequestMapping("/create")
	public ModelAndView validate(@RequestParam("fname") String firstname,
			@RequestParam("lname") String lastname) 
	{
		
		ModelAndView mav = new ModelAndView("csuccess");
		mav.addObject("FNAME",firstname);
		mav.addObject("LNAME",lastname);
		return mav;	
	
			
	}	
}
