package com.tech;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction txn=s.beginTransaction();
		
		Employee e=new Employee();
		e.setName("shubham");
		
		
		List<Addr> l=new ArrayList<>();
		Addr a=new Addr();
		a.setCity("pune");
		a.setPincode(411014);
		
		l.add(a);
		e.setAddr(l);
		
		s.save(a);
		s.save(e);
		txn.commit();
	}

}
