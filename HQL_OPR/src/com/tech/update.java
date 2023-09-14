package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class update {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		player p=new player();
		p.setId(7);
		p.setName("ms.dhoni");
		p.setAge(35);
		p.setTeam("csk");
		
		s.saveOrUpdate(p);
		Transaction txm=s.beginTransaction();
	    txm.commit();
		
	}
}
