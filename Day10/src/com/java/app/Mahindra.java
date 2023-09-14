package com.java.app;

public class Mahindra implements Vehicles {

	@Override
	public int car() {
		System.out.println("--- Mahindra Car ---- ");
		return 0;
	}

	@Override
	public void bike() {
		System.out.println("--- Mahindra bike ---- ");		
	}

	@Override
	public void truck() {
		System.out.println("--- Mahindra truck ---- ");		
	}

}
