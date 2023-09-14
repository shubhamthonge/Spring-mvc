package com.java1.com;

public class employee {

	static int id=154;
	String name="sankat";
	static String work;
	
	void ep(){
		int id=122;
		String work="java developer";
		System.out.println(this.name);
		System.out.println(id);
		System.out.println(work);
	}
	static void ep1() {
		String name="abhi";
		System.out.println("inside"+name);
		System.out.println(id);
		System.out.println(work);
	}
    public static void main(String[] args) {
		employee e= new employee();
		e.ep();
		System.out.println("00000000000000000000000");
		e.ep1();
	}
}


