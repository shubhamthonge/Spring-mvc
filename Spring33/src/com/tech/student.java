package com.tech;

import java.util.List;

public class student {
	
	private int id;
	private String name;
	
	private List<String> addr;
	
	public List<String> getAddr() {
		return addr;
	}

	public void setAddr(List<String> addr) {
		this.addr = addr;
	}

	public student() {
		// TODO Auto-generated constructor stub
	}

	public student(int id) {
		super();
		this.id = id;
	}

	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

	
	
}
