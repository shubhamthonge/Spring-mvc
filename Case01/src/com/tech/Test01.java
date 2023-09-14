package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test01 {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction txn =s.beginTransaction();
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("shubham");
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("rudra");
		Employee e3=new Employee();
		e3.setId(3);
		e3.setName("viraj");
		Employee e4=new Employee();
		e4.setId(4);
		e4.setName("shiv");
		Employee e5=new Employee();
		e5.setId(5);
		e5.setName("ram");
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(e4);
		s.save(e5);
		txn.commit();
	}
	

}
