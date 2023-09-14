package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

	public static void main(String[] args) {

		ApplicationContext al= new ClassPathXmlApplicationContext("beans.xml");
		Employee e2=(Employee) al.getBean("e");
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println("***************");
		System.out.println();
		Employee e3= (Employee) al.getBean("e1");
		System.out.println(e3.getId());
		System.out.println(e3.getName());
		System.out.println("***************");
	}

}
