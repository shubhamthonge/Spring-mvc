package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("beans.xml");
		
		student s=(student) cap.getBean("a"); 
		 System.out.println(s.getName());
		
		
		 
		 cap.close();
	}

}
