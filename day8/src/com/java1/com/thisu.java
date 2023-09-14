package com.java1.com;

public class thisu {

	int no=12;
	String name= "infosys";
   static String addr;
    
    void th1(){
    	int no=15;
    	System.out.println("inside th1----"+this.no);
    }
    
   static void  th2(){
	   String addr="pune-14";
	   
	   System.out.println("inside th2-----"+addr);
    
    }
    public static void main(String[] args) {
		thisu t=new thisu();
		t.th1();
	System.out.println(t.no);
	System.out.println(t.name);
	System.out.println(t.addr);
		t.th2();
		
	}
}
