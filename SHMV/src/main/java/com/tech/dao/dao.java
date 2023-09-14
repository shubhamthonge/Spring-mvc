package com.tech.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.student.student;

@Repository
public class dao {
	
	public dao() {
		System.out.println("inside dao cons");
	}

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean validate(String username ,String password) {
		System.out.println("inside validate method");
	
		Session s = sessionFactory.openSession();	
		Criteria cr	=s.createCriteria(student.class);
		Criterion cr1=Restrictions.eq("username", username);
		Criterion cr2=Restrictions.eq("password", password);
		cr.add(cr1);
		cr.add(cr2);
		
		
		return false;
	}	
}
