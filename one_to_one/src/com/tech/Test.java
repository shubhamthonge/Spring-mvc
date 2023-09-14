package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction txn=s.beginTransaction();
		 
		Sub s1=new Sub();
		s1.setName("MATCH");
		
		Teacher t=new Teacher();
		t.setName("Pankaj");
		t.setSub(s1);
		s1.setTeacher(t);
		
		s.save(s1);
		s.save(t);
		
		txn.commit();
	}

}
