package com.syntax.class22;

public class StudentTest {
	
	
	public static void main(String[] args) {
		
		
		Student obj1=new Student(300);
		obj1.pay();
		
		
		SyntaxStudent obj2=new SyntaxStudent(200, "Syntax");
		obj2.pay();
		
		
		CollegeStudent obj3=new CollegeStudent(200);
		obj3.pay();
		
		
		SchoolStudent obj4=new SchoolStudent(30);
		obj4.pay();
		
		System.out.println("-----------------------");
		
		Student obj5=new SyntaxStudent(500, "CyberTech");
		obj5.pay();
		
		
	}

}
