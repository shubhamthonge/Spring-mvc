package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.studentservice;
@Controller
public class studentcontroller {

	public studentcontroller() {
		System.out.println("inside studentcontroller constructor");
	}
	@Autowired
	studentservice studentservice;

	@RequestMapping("/login")
	public ModelAndView validateUser(@RequestParam("uname") String uname, @RequestParam("pass") String pass) {
		System.out.println("inside validateuser method");
		System.out.println(uname + "-----" + pass);

	
		boolean result = studentservice.updatestudent(uname, pass);
		System.out.println("the response from loginService.validateUser is :" + result);

		if (result) {
			ModelAndView mav = new ModelAndView("success");
			mav.addObject("USER", uname);
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("failure");
			mav.addObject("USER", uname);
			return mav;
		}


	
}

}
