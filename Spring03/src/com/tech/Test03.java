package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
	
	public static void main(String[] args) {
		
	ApplicationContext acl=new ClassPathXmlApplicationContext("beans.xml");
	Employee s=(Employee)acl.getBean("e");
	System.out.println(s.getId());
	System.out.println(s.getName());
	System.out.println(s.getAddress());
	System.out.println(s.getAddress().getCityname());
	System.out.println(s.getAddress().getPincode());
	
	
	}

}
