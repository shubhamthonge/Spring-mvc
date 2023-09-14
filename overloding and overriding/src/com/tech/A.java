package com.tech;

 public class A {

	 public A() {
		// TODO Auto-generated constructor stub
	}
	public  void name(int a,int b) {
		System.out.println("inside name A="+(a+b));
	}	 
	
	 
	public void name(String b,int a) {
	System.out.println("inside name test ="+(b)+(a));
	}
		
	 public static void main(String[] args) {
		A a=new A();
		//A.name(58, 96);
		a.name("shubham", 22);
		a.name(88, 89);
	}
 }