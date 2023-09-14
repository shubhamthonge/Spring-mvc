package com.tech;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class sum {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Criteria cr=s.createCriteria(employee.class);
		Projection p1=Projections.sum("id");
		cr.setProjection(p1);
		 
		Long eid =(Long)cr.uniqueResult();
		System.out.println("sum id is="+eid);
	}

}
