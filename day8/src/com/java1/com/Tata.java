package com.java1.com;

public class Tata implements Vehicle ,Evehicle {

	@Override
	public double car(String name, int price) {
		name="nano";
		System.out.println("name is-"+name);
		price=102000;
		System.out.println("price is-"+price);
		return 0;
	}

	@Override
	public int bike(String company, String color) {
		company="splendor";
		System.out.println("company name is-"+company);
		color="red";
		System.out.println("color is-"+color);
		return 0;
	}

	@Override
	public void bicycle(String modal, int price) {
		// TODO Auto-generated method stub
		modal="Urban Terrain";
		System.out.println("model name -"+modal);
	    price=10999;	
	    System.out.println("price-"+price);
		}
		public void  avrage(){
		int  speed=avrage+3;
			System.out.println ("avrage is-"+speed);
		
			}	
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

		
			

}
