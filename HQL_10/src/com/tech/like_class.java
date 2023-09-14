package com.tech;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class like_class {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Criteria criteria = s.createCriteria(player.class);

		Criterion cr=Restrictions.gt("id", 2);
		
		criteria.add(cr);
		
		List<player> playerList=criteria.list();
		System.out.println(playerList);
	}

	}


