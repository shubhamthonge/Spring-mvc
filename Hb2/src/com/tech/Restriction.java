package com.tech;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Restriction {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Criteria cr=s.createCriteria(employee.class);
		Criterion cr1=Restrictions.gt("id",1);
		cr.add(cr1);
		List<employee>elist=cr.list();
		
		for(employee e:elist)
		{
			System.out.println(e.getCity());
		}
	}

	
}
