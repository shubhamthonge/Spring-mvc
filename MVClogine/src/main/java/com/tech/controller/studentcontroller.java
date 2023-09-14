package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.dto.student;
import com.tech.service.studentsrevice;




@Controller
public class studentcontroller {
	@Autowired
	studentsrevice studentsrevice;

	public studentcontroller() {
		System.out.println("inside  studentcontroller cons");
	}

	@RequestMapping(value = "/createstudent", method = RequestMethod.POST)
	public ModelAndView createstudent(@RequestParam ("id")int id,@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("pno") String phoneno) {
		System.out.println("inside studentcontroller.createstud ");
		System.out.println(id);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(phoneno);
		
		student student= new student();
		student.setId(id);
		student.setFirstname(fname);
		student.setLastname(lname);
		student.setPhoneno(phoneno);
		
		boolean recordsinsrted= studentsrevice.createstudent(student);
		
		if(recordsinsrted){
			System.out.println("createstudent:-records inserted successfully ");
			ModelAndView mav = new ModelAndView("createsuccess");
			return mav;
		}else
		{
			System.out.println("createstudent:-records inserted successfully ");
			ModelAndView mav = new ModelAndView("createfailure");
			return mav;
		}
	}
	@RequestMapping("/getall")
	 public ModelAndView getAll()
	 {
	 System.out.println("inside studentController.getAll ");
	 
	List< student> stdlist=studentsrevice.getall();
	 
	ModelAndView mav = new ModelAndView("getall");
	 mav.addObject("stdlist", stdlist);
	 return mav;
	 
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") int id)
	{
		
		System.out.println("inside studentController. delete"+id);
		studentsrevice.delete(id);
		
		ModelAndView mav = new ModelAndView("getall");
		List<student> stdlist=studentsrevice.getall();
		mav.addObject("stdlist", stdlist);
		
		return mav;
	}

	@RequestMapping("/editstudent")
	public ModelAndView editstudent(@RequestParam("id") int id) {

		System.out.println("inside studentController. editstudent-->" + id);

		student student = studentsrevice.editstudent(id);
		ModelAndView mav = new ModelAndView("Edit");
		mav.addObject("studentdata", student);
		return mav;

	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam("id1") int id, @RequestParam("fname1") String fname,
			@RequestParam("lname1") String lname, 
			@RequestParam("pno1") String phoneno) {
		System.out.println("inside studentController.update ");
		System.out.println(id);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(phoneno);

		student s = new student();
		s.setId(id);
		s.setFirstname(fname);
		s.setLastname(lname);
		s.setPhoneno(phoneno);
		studentsrevice.update(s);

		ModelAndView mav = new ModelAndView("getall");
		List<student> student = studentsrevice.getall();
		mav.addObject("stdlist", student);
		return mav;

	}


}

