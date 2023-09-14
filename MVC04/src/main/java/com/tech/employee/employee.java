package com.tech.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.service;

@Controller
public class employee {

	public employee() {
	System.out.println("inside employee constructor");
		}
	
	@RequestMapping("/login")
	public ModelAndView validate (@RequestParam("uname") String username,@RequestParam("pass") String password) {
		System.out.println("inside model and view");
		
		service service=new service();
		boolean s=service.validate(username,password);
		System.out.println(s);
		
		if(s) {
			ModelAndView mav=new ModelAndView("success");
			mav.addObject("USERUSER",username);
			return mav;
			
		}else {
			
			ModelAndView mav=new ModelAndView("failuer");
			mav.addObject("USERUSER",username);
			return mav;
		}
		
	}
}
