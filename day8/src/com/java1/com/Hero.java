package com.java1.com;

public class Hero implements Vehicle,Evehicle1{

	
	public double car(String name, int price) {
		name="destini";
		System.out.println("name is-"+name);
		price=800000;
		System.out.println("price is-"+price);
		return 0;
	}

	@Override
	public int bike(String company, String color) {
		company="herohonda";
		System.out.println("company name is-"+company);
		color="black";
		System.out.println("color is-"+color);
		return 0;
	}

	@Override
	public void bicycle(String modal, int price) {
	modal="hero";
	System.out.println("model name -"+modal);
    price=7400;	
    System.out.println("price-"+price);
	}
	public void  avrage(){
	int  speed=avrage+5;
		System.out.println ("avrage is-"+speed);
		
	}

	@Override
	public void Ebike(String modal, int price) {
		modal="pash hero";
		System.out.println("name is-"+modal);
		price=72000;
		System.out.println("price is-"+price);
		
	}
	

	@Override
	public double Ecar(String name, int capacity) {
		name="chery";
		System.out.println("name is-"+name);
		capacity=400000;
		System.out.println("price is-"+capacity);
		return 0;
	
		
	}

	@Override
	public void Ebus(String model) {
		model="72v";
		System.out.println(model);
		
	}

}
