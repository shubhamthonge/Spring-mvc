package com.insta.app;

public class Result1 {

	public static void main(String[] args) {
		 Vehicle v=new TATA();
		 v.bike();
		 v.car();
		 System.out.println(v.a);
		 System.out.println(v.b);
		 System.out.println("********------********");
		 TATA t =new TATA();
		 t.bike();
		 t.bus();
		 t.car();
		 t.cycle();
		 
	}
}
