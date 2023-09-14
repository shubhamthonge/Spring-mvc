package com.jvm.app;

public class Output {

	public static void main(String[] args) {
		Rollno21 r =new Rollno21();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.c);
		r.add();
		r.book();
		r.convert();
		r.remove();
		r.replace();
		r.switc();
	System.out.println("***** P TO C *****");
		Student s=new Rollno21();
		System.out.println(s.a);
		System.out.println(s.b);
		s.convert();
		s.remove();
		s.replace();
		s.book();
}
}