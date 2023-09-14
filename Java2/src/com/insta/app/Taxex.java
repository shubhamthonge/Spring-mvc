package com.insta.app;

public class Taxex extends Company {

	int a=55;
	int c=22;
	
	 void employee(){
		 super.employee();
	    	System.out.println(" employee in  Taxex ");
	    	
	    }
	    
	    public void Sales() {
	    	super.Sales();
	    	System.out.println(" Sales in  Taxex ");
	    	
	    }
	
	public Taxex(int a ,int c ) {
			super(a, c);
			
			System.out.println(a);
			System.out.println(c);
		}

	protected void finance() {
		
		System.out.println(" finance in Taxex");
	}
	
	public int HR() {
		super.IT();
		System.out.println(" HR in Taxex");
		return 0;
	}
	
}
