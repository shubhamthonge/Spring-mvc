package com.hp.app;

public class book {
    
	public String bookname;
    public String author;
	private int price;
	
	public book( String bookname, String author, int price) {
		this.bookname=bookname;
		this.author=author;
		this.price=price;
		
	}
	
	
	

	public String getbookname() {
		return bookname;
	}
	public void setbookname(String bookname) {
		this.bookname = bookname;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	
	void display() {
		System.out.println();
	}
	
   
		

}