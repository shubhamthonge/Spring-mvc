package com.tech;

public class citybank extends hdfc {

	@Override
	public void saving() {
		System.out.println("saving");
	}
	
	public static void main(String[] args) {
		citybank c=new citybank();
		c.saving();
		c.current();
	}

}
