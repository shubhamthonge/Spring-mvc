package com.tech;

public class Player {
	    String Fname;
	    String lname;
	    String Email;
	    public Player() {
	    	System.out.println("inside player");
	    }
		public Player(String fname, String lname, String email) {
			Fname = fname;
			lname = lname;
			Email = email;
		}
		public String toString() {
			return"Player [fname" + Fname +",lname=" + lname +", email=" + Email +"]";
		}

	    
}
