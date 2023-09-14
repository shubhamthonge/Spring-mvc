package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class employee {

	
	public employee() {
		System.out.println("inside employee cons");
	}
	
	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("uname") String username,@RequestParam("pass") String password)
	{
		System.out.println("inside validate method");
		
		if(username.equals("shubham")&& password.equals("shub123")) {
	
		ModelAndView mav = new ModelAndView("success");
		mav.addObject("USERNAME",username);
		return mav;	
	}else
		{
		ModelAndView mav = new ModelAndView("failuer");
		mav.addObject("USERNAME",username);
		return mav;	
	}
	
}	
	
}
