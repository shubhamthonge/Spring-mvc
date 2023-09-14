package com.tech;

public class player {

	private int age;
	private String name; 
	private String team	;
	
		public player(int age, String name, String team) {
		super();
		this.age = age;
		this.name = name;
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	public String toString() {
		return "player [age=" + age + ", name=" + name + ", team=" + team + "]";
	}

}

	
	

