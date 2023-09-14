package com.java1.com;

public class output {
	int age;
	String name;
	
	static void out(int a) {
		
		System.out.println(a);
		
	}
	void put(String addr) {
		System.out.println(addr);
	}
		public static void main(String[] args) {
			
			output o=new output();
			o.age=12;
			o.name="raj";
			output.out(55);
		
			o.put("pune");
			System.out.println(o.age);
			System.out.println(o.name);
		}
}
