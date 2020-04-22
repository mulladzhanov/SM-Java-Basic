package com.syntax.class22;

public class Student {
	
	/* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
	 * Define common behavior within parent class and override some of the methods in child classes
	 * Define some methods specific to child classes
	 * Write example of achieving run time polymorphism 
	 */
	int amount;
	
	Student(int amount) {
		
		this.amount=amount;
		
	}
	
	public void pay() {
		System.out.println("The students should select the schoold first");
	}

}

class SyntaxStudent extends Student {
	
	String a;
	
	SyntaxStudent (int amount, String a) {
		super(amount);
		this.a=a;
		
	}
	
	public void groupWork() {
		System.out.println("Group work");
		
	}
	

	public void pay() {
		System.out.println("The students of "+a+" should pay "+amount);
		
	}
	
}

class CollegeStudent extends Student {
	
	CollegeStudent(int amount) {		
		super(amount);
		
	}
	

	public void pay() {
		System.out.println("The students of College should pay "+amount);
		
	}
	public void party() {
		System.out.println("Sometimes party");
		
	}
	
	
}
 
class SchoolStudent extends Student {
	
	SchoolStudent(int amount) {
		super(amount);
	}
		
    public void study() {
    	System.out.println("Need to study");
    }
	
	public void pay() {
		System.out.println("The students of College should pay "+amount);
	}	
	
}