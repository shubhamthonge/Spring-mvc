package com.tech.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.dto.user1;

@Repository
public class logindao {
	
	public logindao() {
		System.out.println(" inside logindao constructor ");
	}

	@Autowired
	SessionFactory SessionFactory;
	
	public boolean login(String username, String password) {
		Session s=SessionFactory.openSession();
		
		Criteria cr= s.createCriteria(user1.class);
		Criterion c1=Restrictions.eq("username", username);
		Criterion c2=Restrictions.eq("password", password);
		cr.add(c1);
		cr.add(c2);
		
		user1 userdb=(user1)cr.uniqueResult();
		
		if(userdb==null) {
			System.out.println("data not present in db");
			return false;
		}else {
			System.out.println("data  present in db");
			return true;
	}
		
	}	
	
}
