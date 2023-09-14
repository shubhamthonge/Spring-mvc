package com.java1.com;

public class MandM implements Vehicle {
	public double car(String name, int price) {
		name="scorpio";
		System.out.println("name is-"+name);
		price=1300000;
		System.out.println("price is-"+price);
		return 0;
	}

	@Override
	public int bike(String company, String color) {
		company="centuro";
		System.out.println("company name is-"+company);
		color="sliver";
		System.out.println("color is-"+color);
		return 0;
	}

	@Override
	public void bicycle(String modal, int price) {
	modal="hercules";
	System.out.println("model name -"+modal);
    price=4500;	
    System.out.println("price-"+price);
	}
	public void  avrage(){
	int  speed=avrage+6;
		System.out.println ("avrage is-"+speed);
		
	}

}
