package com.insta.app;

public class Result {

	public static void main(String[] args) {
		
		Company c=new Company(20,30);
		c.employee();
		c.Sales();
		c.IT();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println("****************");
		 Taxex a =new Taxex(40 ,50);
		a.employee();
		a.Sales();
		a.finance();
		a.HR();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		
	}
}
