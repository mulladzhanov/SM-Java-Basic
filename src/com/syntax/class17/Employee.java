package com.syntax.class17;

public class Employee {

	
		// create variables to hold ; name,last name,title,ssn, salary;
	
	
	static String title;
	
	public String name; //accessible everywhere
	protected String lastName; //accessible within the same package
	double salary;       //accessible with the same package
	private long ssn;  //accessible ONLY within the same class
	
	
	public static void method1() {
		System.out.println("I am public method");
	}
	
	protected void method2() {
		System.out.println("I am protected method");
	}
    
	void method3() {
		System.out.println("I am default method");
	}
		
	private void method4() {
		System.out.println("I am private method");
	}
		

	

}
