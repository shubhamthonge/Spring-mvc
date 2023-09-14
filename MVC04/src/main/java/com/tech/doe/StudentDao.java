package com.tech.doe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class StudentDao {
	
	public StudentDao() {
		System.out.println("inside StudentDao constructor");
	}
	

	public void updateStudent() {
		System.out.println("inside StudentDao.updateStudent()");
	}

    public void createStudent() {
    	System.out.println();
    }
	
}
