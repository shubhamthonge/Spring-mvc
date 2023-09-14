package com.java.app;

public class outputv {
	
public static void main(String[] args) {
	
	System.out.println("****** for Mahindra ******");
	Mahindra m=new Mahindra();
	m.car();
	m.bike();
	m.truck();
	
	System.out.println("****** for Tata ******");
	Tata t=new Tata();
	t.car();
	t.bike();
	t.truck();
	t.jeep();
	
	System.out.println("****** for  Hyundai  ******");
	Hyundai h=new Hyundai();
	h.car();
	h.bike();
	h.truck();
	h.tractor();
	
}
}