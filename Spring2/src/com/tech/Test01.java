package com.tech;

public class Test01 {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.setId(23);
		e.setName("raj");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println("***************");
		
		Employee n=new Employee();
		n.setId(58);
		n.setName("kumar");
		System.out.println(n.getId());
		System.out.println(n.getName());
	}

}
