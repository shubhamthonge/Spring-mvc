package com.tech;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test03 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction txn=s.beginTransaction();
		
		Employee e1=new Employee();
		e1.setName("shubham");
		
		
		List<Addr> l=new ArrayList<>();
		
		Addr a=new Addr();
		a.setCity("pune");
		a.setPincode(411014);
		
		Addr a1=new Addr();
		a1.setCity("nasik");
		a1.setPincode(821017);
		
		l.add(a);
		l.add(a1);
		e1.setAddr(l);
		e1.setAddr(l);
		
		s.save(a);
		s.save(e1);
		s.save(a1);
		txn.commit();
	}

	
}


