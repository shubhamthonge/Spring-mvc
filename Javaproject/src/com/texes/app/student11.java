package com.texes.app;

public class student11 {

	int id;
	String name;
	int rollno;
	
public student11(int id, String name, int rollno) {
		
		this.id = id;
		this.name = name;
		this.rollno = rollno;
}

	public student11(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	

	public student11(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		student11 aa = new student11(02, "raj", 23);
		System.out.println(aa.id);
		System.out.println(aa.name);
		System.out.println(aa.rollno);
		System.out.println(    33333333      );
		student11 aa1=new student11(03,"shubham");
		System.out.println(aa1.id);
		System.out.println(aa1.name);
		System.out.println( 2222222         );
		student11 aa2= new student11("sankat");
		System.out.println(aa2.name);
}

	
	
}