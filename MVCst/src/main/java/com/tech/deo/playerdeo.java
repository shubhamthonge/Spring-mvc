package com.tech.deo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.dto.player;

@Repository
public class playerdeo {

	public playerdeo() {
		System.out.println("into playerdeo cons");
	}
	
	@Autowired
	SessionFactory SessionFactory;

	
	public boolean login(String username,String password) {
		Session s =SessionFactory.openSession();
		
		Criteria cr=s.createCriteria(player.class);
		Criterion c1=Restrictions.eq("username",username);
		Criterion c2=Restrictions.eq("password", password);
		cr.add(c1);
		cr.add(c2);
		
		player p1=(player)cr.uniqueResult();
		
		if(p1==null){
			System.out.println("data is absent ");
			return true;
			
		}else {
			System.out.println("data is present");
			return false;
		}
	}
}
