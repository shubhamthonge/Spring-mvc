package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tech.dao.studentdao ;
@Service
public class studentservice {

	public studentservice() {
		System.out.println("inside StudentService constructor ");
	}

	@Autowired
	studentdao studentdao;
	
	public boolean updatestudent(String username, String password) {
		System.out.println("inside StudentService.updateStudent() ");
	boolean	 validate=studentdao.updatestudent( username,password);
		return validate;
}

}