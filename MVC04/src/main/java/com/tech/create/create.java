package com.tech.create;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class create {

	public create() {
	System.out.println("inside  create constructor");	
	}
	
	@RequestMapping("/create")
	public ModelAndView create(@RequestParam("eid")String id,@RequestParam("ename")String name) {
		
		ModelAndView mav=new ModelAndView("create susscesfully");
		mav.addObject("eid",id);
		mav.addObject("ename",name);
		System.out.println("jfdsxcvbn");
		return mav;
	}
}
