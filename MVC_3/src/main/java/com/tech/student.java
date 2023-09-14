package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class student {
	
	public student() {
	System.out.println("inside student cons");	
	}

	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("uname") String username,@RequestParam("pass") String password)
	{
		System.out.println("inside validate method");
		
		service service=new service();
		boolean s=service.validate(username, password);
		System.out.println(s);
		if(s) {
	
		ModelAndView mav = new ModelAndView("success");
		mav.addObject("USERNAME",username);
		return mav;	
	
	}else{
		
		ModelAndView mav = new ModelAndView("failuer");
		mav.addObject("USERNAME",username);
		return mav;	
	}
}
}