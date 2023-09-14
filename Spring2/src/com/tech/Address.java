package com.tech;

public class Address {

	
	private String cityname;
	private int pincode;
	
	public Address() {
		System.out.println("******cons*****");	
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
