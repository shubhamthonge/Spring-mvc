package com.texes.app;

public class players {

	int jerseyno;
	String name;
	String teamname;
	 
	public players(int jerseyno, String name, String teamname) {
		super();
		this.jerseyno = jerseyno;
		this.name = name;
		this.teamname = teamname;
	}

	public players(int jerseyno, String name) {
		super();
		this.jerseyno = jerseyno;
		this.name = name;
	}

	public players(int jerseyno) {
		super();
		this.jerseyno = jerseyno;
	}

	public static void main(String[] args) {
		 players pp= new  players (07,"ms dhoni","csk");
		 System.out.println(pp.jerseyno);
		 System.out.println(pp.name);
		 System.out.println(pp.teamname);
		 System.out.println("for 333333");
		 System.out.println();
		 players pp2= new  players(18,"virat kohli");
		 System.out.println(pp2.jerseyno);
		 System.out.println(pp2.name);
		 System.out.println("for 2222222");
		 System.out.println();
		 players pp1= new  players(1);
		 System.out.println(pp1.jerseyno);
		 System .out.println("for only 11111111");
		
	}
}

