package com.tech;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class test_projaction {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Criteria criteria = s.createCriteria(player.class);
		Criterion cr1=Restrictions.eq("id", 2); 

		Projection pr1 = Projections.property("name");

		criteria.add(cr1);
		criteria.setProjection(pr1);
		String name = (String) criteria.uniqueResult();
		System.out.println(name);


	}

}
