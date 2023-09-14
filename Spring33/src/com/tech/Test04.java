package com.tech;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

	public static void main(String[] args) {

		ApplicationContext cfg=new ClassPathXmlApplicationContext("beans.xml");
		student s=new student();
		s.setId(12);
		s.setName("adi");
		List<String> addr=new ArrayList<>();
		addr.add("pune");
		addr.add("411014");
		s.setAddr(addr);
		System.out.println(s);
		System.out.println();
		
		student s1=new student();
		s1.setId(89);
		s1.setName("akash");
		List<String> addr1=new ArrayList<>();
		addr1.add("nasik");
		addr1.add("639521");
		s1.setAddr(addr1);
		System.out.println(s1);
		System.out.println();
		
		student s2=new student();
		s2.setId(45);
		s2.setName("kumar");
		List<String> addr2=new ArrayList<>();
		addr2.add("mumbai");
		addr2.add("321589");
		s2.setAddr(addr2);
		System.out.println(s2);
	}

}

