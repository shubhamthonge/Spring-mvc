package com.java1.com;

public class Ashokleyland implements Vehicle {
	
	public double car(String name, int price) {
		name="bada dost";
		System.out.println("name is-"+name);
		price=150000;
		System.out.println("price is-"+price);
		return 0;
	}

	@Override
	public int bike(String company, String color) {
		company="Xtreme160R";
		System.out.println("company name is-"+company);
		color="blue";
		System.out.println("color is-"+color);
		return 0;
	}

	@Override
	public void bicycle(String modal, int price) {
		// TODO Auto-generated method stub
		modal=" Terrain";
		System.out.println("model name -"+modal);
	    price=8999;	
	    System.out.println("price-"+price);
		}
		public void  avrage(){
		int  speed=avrage+8;
			System.out.println ("avrage is-"+speed);
			
		}
		
	

}

	


