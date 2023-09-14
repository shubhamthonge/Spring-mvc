package com.tech;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee01")
public class Employee {

	
	@Id
	@GeneratedValue
	@Column(name="eid")
	private int id;
	
	@Column(name="ename")
	private String name;
	
	
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	private List<Addr> addr;


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


	public List<Addr> getAddr() {
		return addr;
	}


	public void setAddr(List<Addr> addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

	 
	
}
	