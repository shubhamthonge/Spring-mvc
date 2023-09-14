package com.tech;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction txn = s.beginTransaction();

		List<Address> l = new ArrayList<Address>();

		Address a1 = new Address();
		a1.setCityname("pune");
		a1.setPincode("10235");

		Address a2 = new Address();
		a2.setCityname("mumbai");
		a2.setPincode("36512");
		
		Address a3 = new Address();
		a3.setCityname("nashik");
		a3.setPincode("632816");
		
		l.add(a1);
		l.add(a2);
		l.add(a2);

		Student s1 = new Student();
		s1.setName("Rudra");
		s1.setAddress(l);

		s.save(a1);
		s.save(a2);
		

		s.save(s1);

		txn.commit();
	}

}

