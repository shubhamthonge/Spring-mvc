package com.tech;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class Projection_test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Criteria cr=s.createCriteria(employee.class);
		Projection p1= Projections.property("name");
		cr.setProjection(p1);
		List<String> list= cr.list();
		
		for(String name:list) 
		{
			System.out.println(name);
		}
	}
	

}
