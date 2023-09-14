package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.studentdao;
import com.tech.dto.student;



@Service
public class studentsrevice {

	@Autowired

	 studentdao  studentdao;
	public studentsrevice() {
		System.out.println("inside stuentService constructor");
	}

	
	public boolean createstudent( student  student)
	{
		System.out.println("inside createstudent.createstudent" + student);
		boolean recordsInserted= studentdao.createstudent(student );
		
		if(recordsInserted)
		{
			return true;
			
		}else
		{
			return false;			
		}
	}
	public List<student> getall(){
		 
		System.out.println("inside studentservice.getAll()");
		 List<student> stdlist=studentdao.getall();
		 
		return stdlist;
		 }

	public void delete(int id)
	{
		System.out.println("inside studentservice.delete()");
		studentdao.delete(id);
	}

	public student editstudent(int id)
	{
		System.out.println("inside studentservice.editstudent()");
		student student=studentdao.editstudent(id);
		return student;
	}
	public void update(student student)
	{
		System.out.println("inside studentservice.update()");
		studentdao.update(student);
	}


}
