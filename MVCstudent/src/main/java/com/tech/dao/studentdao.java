package com.tech.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.dto.user;

@Repository
public class studentdao {


	@Autowired
	SessionFactory sessionFactory;

	public boolean updatestudent(String username, String password) {
		
		System.out.println("inside studentdao");
		Session session = sessionFactory.openSession();

		Criteria cr = session.createCriteria(user.class);
		Criterion cr1 = Restrictions.eq("username", username);
		Criterion cr2 = Restrictions.eq("password", password);
		cr.add(cr1);
		cr.add(cr2);

		user userfromDB = (user) cr.uniqueResult();
		
		if (userfromDB == null) {
			System.out.println("records is not present in db");
			return false;
		} else {
			System.out.println("records is  present in db");
			return true;

}
	}
}
