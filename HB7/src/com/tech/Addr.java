package com.tech;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Addr")
public class Addr {

	@Id
	@GeneratedValue
	@Column(name ="id")
	private int id;
	
	@Column
	private String city;
	
	@Column
	private int pincode;

	public Addr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Addr [id=" + id + ", city=" + city + ", pincode=" + pincode + "]";
	}

	
}