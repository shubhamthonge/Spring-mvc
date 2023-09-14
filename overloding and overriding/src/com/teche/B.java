package com.teche;

public class B {
 
	public void sub(int b,int v) {
		System.out.println("inside sub B=" +(b-v));
	}
}

class Test extends B{
	 
	@Override
	public void sub(int b,int v) {
		System.out.println("inside sub Test=" +(b-v+230));
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.sub(25, 15);
		
		B b=new B();
		b.sub(55, 20);
	
		
	}
	
}