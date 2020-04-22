package com.syntax.class29;

public class Student {
	
	String name;
	long id;
	
	Student (String name, long id) {
		this.name=name;
		this.id=id;		
		
	}
	
	public void display() {
		System.out.println(name+" "+id);
	}

}
