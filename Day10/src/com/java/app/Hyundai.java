package com.java.app;

public class Hyundai extends Maruti implements Agriculturevehicles  {

	@Override
	public String tractor() {
		System.out.println("---  Hyundai tractor ---- ");	

		return null;
	}

	@Override
	public int car() {
		System.out.println("--- Hyundai Car ---- ");
		return 0;
	}

	@Override
	public void bike() {
		System.out.println("--- Hyundai bike ---- ");		
	}

	@Override
	public void truck() {
		System.out.println("--- Hyundai truck ---- ");		
	}


}
