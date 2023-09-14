package com.tech;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String cityname;
	@Column
	private String pincode;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public Address(int id, String cityname, String pincode) {
		super();
		this.id = id;
		this.cityname = cityname;
		this.pincode = pincode;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", cityname=" + cityname + ", pincode=" + pincode + "]";
	}
	
	
}

