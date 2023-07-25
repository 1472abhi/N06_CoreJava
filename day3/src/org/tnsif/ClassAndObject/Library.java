//program to demonstrate on default and parameter constructor
package org.tnsif.ClassAndObject;

public class Library {
	
	
	public long  noofBooks;
	public String authorName;
	public String Bookname;
	public double price;
	
	public Library() {
		System.out.println("Default Constructor");
		// TODO Auto-generated constructor stub
	}
	public Library(long noofBooks, String authorName, String bookname, double price) {
		super();
		this.noofBooks = noofBooks;
		this.authorName = authorName;
		Bookname = bookname;
		this.price = price;
		System.out.println("Parameterized Constructor");
	}
	@Override
	public String toString() {
		return "Library [noofBooks=" + noofBooks + ", authorName=" + authorName + ", Bookname=" + Bookname + ", price="
				+ price + "]";
	}
	
	

}
