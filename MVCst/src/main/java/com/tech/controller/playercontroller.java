package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.playerservice;
@Controller
public class playercontroller {

	@Autowired
	playerservice playerservice;
	
	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("uname")String username,@RequestParam("pass")String password){
	
		boolean result=playerservice.login(username,password);
		
		if(result) {
			ModelAndView mvc=new ModelAndView("success");
			mvc.addObject(username);
			return mvc;
		}else {
			ModelAndView mvc=new ModelAndView("failuer");
			mvc.addObject(username);
			return mvc;
		}
	}
	
}
