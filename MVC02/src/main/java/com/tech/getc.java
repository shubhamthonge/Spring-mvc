package com.tech;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class getc {

	public getc() {
		System.out.println("inside get cons ");
		}
	
	@RequestMapping("/getall")
	public ModelAndView getall() {

		List<String> a=new ArrayList<>();
		ModelAndView mav=new ModelAndView();
		a.add("raj");
		a.add("rajkumar");
		a.add("rahul");

		mav.addObject("employee_list",a);
		return mav;
	}
}
