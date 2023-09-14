package com.java1.com;

public class Suzuki implements Vehicle{
	public double car(String name, int price) {
		name="maruti suzuki";
		System.out.println("name is-"+name);
		price=140000;
		System.out.println("price is-"+price);
		return 0;
	}

	@Override
	public int bike(String company, String color) {
		company="gixxer sf 150";
		System.out.println("company name is-"+company);
		color="black";
		System.out.println("color is-"+color);
		return 0;
	}

	@Override
	public void bicycle(String modal, int price) {
	modal="Hector";
	System.out.println("model name -"+modal);
    price=15400;	
    System.out.println("price-"+price);
	}
	public void  avrage(){
	int  speed=avrage+5;
		System.out.println ("avrage is-"+speed);
		
	}


}
