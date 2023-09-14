package com.infosys.app;

public class bata {
	int shoeno;
	String type;
	double feetsize;
    String color;
     
    public bata(int shoeno, String type, double feetsize, String color) {
		
		this.shoeno = shoeno;
		this.type = type;
		this.feetsize = feetsize;
		this.color = color;
	}

	public bata(String type, double feetsize, String color) {
	
		this.type = type;
		this.feetsize = feetsize;
		this.color = color;
	}

	public bata(String type, String color) {
		
		this.type = type;
		this.color = color;
	}

	public bata(String type, double feetsize) {

		this.type = type;
		this.feetsize = feetsize;
	}

	public static void main(String[] args) {
    	bata bb= new bata(12, "formal", 9.5, "black");
    	 System.out.println(bb.shoeno);
    	 System.out.println(bb.type);
    	 System.out.println(bb.feetsize);
    	 System.out.println(bb.color);
    	 System.out.println();
    	 bata aa=new bata("casual", 9,"brown");
    	 System.out.println(aa.type);
    	 System.out.println(aa.feetsize);
    	 System.out.println(aa.color);
    	 System.out.println();
    	 bata ba=new bata("casual", 8.5);
    	 System.out.println(ba.type);
    	 System.out.println(ba.feetsize);
    	 System.out.println();
    	 bata b=new bata("running","grey");
    	 System.out.println(b.type);
    	 System.out.println(b.color);
    	 
	}
}
