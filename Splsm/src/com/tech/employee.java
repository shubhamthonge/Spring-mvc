package com.tech;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class employee {
	
	
	private String name;
	
	private List<String> addr;
	
	private Set<Integer> phoneno;
	
	private Map<Integer, String> email;
	
	public employee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAddr() {
		return addr;
	}

	public void setAddr(List<String> addr) {
		this.addr = addr;
	}

	public Set<Integer> getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Set<Integer> phoneno) {
		this.phoneno = phoneno;
	}

	public Map<Integer, String> getEmail() {
		return email;
	}

	public void setEmail(Map<Integer, String> email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", addr=" + addr + ", phoneno=" + phoneno + ", email=" + email + "]";
	}

	
}
