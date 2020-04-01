package com.syntax.class19;

public class Book {
	
	//Write program as a Book class   that will have 2 Constructors. 
	//While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed
	
	String name;
	int page;
	
	public Book() {
		this("Jaga",100);	
		System.out.println("That's why he passed all his exams");
		
		
		
	}
    public Book(String name, int page) {
    	
    	this.name=name;
    	this.page=page;  	
    	
    	System.out.println(name+" reads "+page+" pages a day");	
    	   	
    }
    
    public static void main(String[] args) {
		Book obj=new Book();
	}
	
}
