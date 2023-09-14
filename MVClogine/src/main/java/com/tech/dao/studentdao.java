package com.tech.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.dto.student;


@Repository
public class studentdao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public studentdao() {
		System.out.println("inside LoginDao constructor");
	}
	
	
	public boolean createstudent(student student) {
		System.out.println("inside createstudent.createstudent " +student);
		
		Session session=sessionFactory.openSession();
		int recordinserted=(int) session.save(student);
		session.beginTransaction().commit();
		if(recordinserted>0)
		{
			System.out.println("records inserted successfully for id -->" +recordinserted);
			return true;
		}else
		{
			System.out.println("records inserted unsuccessfully for id -->" +recordinserted);
			return false;
		}
	}
		public List<student> getall()
		{
			System.out.println("inside studentdao.getAll ");
			Session session=sessionFactory.openSession();
			
			
			Criteria cr=session.createCriteria(student.class);
			List<student> stdlist=cr.list();
			System.out.println("stdlist from DB " + stdlist);
			
			return stdlist;
		}
		
		public void delete(int id )
		{
			System.out.println("inside studentDao.delete -->");
			Session session=sessionFactory.openSession();
			
			student student= new student();
			student.setId(id);
			session.delete(student);
			session.beginTransaction().commit();
		}
		
		public student editstudent(int id)
		{
			System.out.println("inside studentdao.editstudent -->");
			Session session=sessionFactory.openSession();
			
			student student=session.get(student.class, id);
			
			System.out.println("student in db for given id " + student);
			
			return student;
		}
		
		public void update(student student)
		{
			System.out.println("inside studentdao.editstudent ");
			Session session=sessionFactory.openSession();
			
			session.saveOrUpdate(student);
			
			session.beginTransaction().commit();
		}
		

		
	}	
	

