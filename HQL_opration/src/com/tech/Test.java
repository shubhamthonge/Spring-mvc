package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		employee_old  e1=new employee_old (1,"shubham","pune");
		employee_old  e2=new employee_old (2,"shubham","nashik");
		employee_old  e3=new employee_old (3,"shubham","mumbai");
		employee_old  e4=new employee_old (4,"shubham","kolhapur");
		employee_old  e5=new employee_old (5,"shubham","dhule");
		
		s.save(e1);
		s.persist(e2);
		s.saveOrUpdate(e3);
		s.persist(e4);
		s.save(e5);
		
		Transaction txe= s.beginTransaction();
		txe.commit();
	}

}
