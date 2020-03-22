package com.syntax.class15;

public class CreatingMethods {

	public static void main(String[] args) {
		
		// create a method that will accept marks (90,80)
		// based on the marks it will return grade (A,B,C)
		// if grade >90 --> A, if 90<grade>80 --> B, 80<>70 --> C
	
		CreatingMethods obj=new CreatingMethods();
		char g=obj.getGrade(80);
		System.out.println(g);
		
		System.out.println(obj.getGrade(65));
		
		if (g == 'A' || g == 'B') {
			System.out.println("Good job");
		} else {
			System.out.println("Study more");
		}
		
	}	
		char getGrade(int a) {
			
		char grade;
			
			if (a>90) {
				grade='A';
			} else if (a<=90 && a>80) {
				grade='B';
			} else if (a<=80 && a>70 ) {
				grade='C';
			} else {
				grade='F';
			}
			
			return grade;
			
		    } 			
		
		
		
		

	

}
