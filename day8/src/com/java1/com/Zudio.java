package com.java1.com;

public class Zudio implements Cloths{

	@Override
	public void mans(int price) {
		System.out.println("mans cloths---");
		price=799;
		System.out.println(price);
	}

	@Override
	public int womans(String color,int price) {
		System.out.println("womans cloths---");
		color="black";
		price=499;
		System.out.println(color);
		System.out.println(price);
		return 0;
	}

	@Override
	public double kids(int age) {
		System.out.println("kids cloths---");
		age=7;
		System.out.println(age);
		return 0;
	}

}

