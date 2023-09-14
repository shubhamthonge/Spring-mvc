package com.tech;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue
	@PrimaryKeyJoinColumn
	@Column(name="Tid")
	private int id;
	
	@Column(name="tname")
	private String name;

	@OneToOne(targetEntity = Sub.class)
	private Sub sub ;

	public Teacher() {
		
		
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

	public Sub getSub() {
		return sub;
	}

	public void setSub(Sub sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sub=" + sub + "]";
	}
	
	
	
	
	}

