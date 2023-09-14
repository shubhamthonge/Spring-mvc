package com.hp.app;

public class computer {

	public String modalno;
	private  int price;
	String processor;
	public String ram;
	
	
	
	public computer(String modalno, int price, String processor, String ram) {
	
		this.modalno = modalno;
		this.price = price;
		this.processor = processor;
		this.ram=ram;
		
	
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public static void main(String[] args) {
		computer cc= new computer("HP 15s",61990,"intel i5","8gb");
		System.out.println(cc.modalno="HP 15s");
		System.out.println(cc.price=61990);
		System.out.println(cc.processor="intel i5");
		System.out.println(cc.ram="8gb");
	
	
	}
	
}

