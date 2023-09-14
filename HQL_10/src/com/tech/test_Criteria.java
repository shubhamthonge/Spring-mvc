package com.tech;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class test_Criteria {

	public static void main(String[] args) {
		

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Criteria cr=s.createCriteria(player.class);
		List<player> Plist = cr.list();
		

		for (player p : Plist) {
			System.out.println(s);

	}
	}
}
