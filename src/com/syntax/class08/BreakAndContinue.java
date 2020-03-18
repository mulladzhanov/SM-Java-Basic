package com.syntax.class08;

public class BreakAndContinue {
	public static void main(String[] args) {
		
		for (int i=1; i<10; i++) {
			
			if (i==4) {
				System.out.println("I am skipping");
				continue; // WE CAN USE BREAK INSTEAD AND STOP THE CODE!!!
			} System.out.println(i);
		}
		
		
		for ( int a=1; a<=70; a++) {
			
			if (a>=35 && a<=55) {
				continue;
		} System.out.println(a);
		
		}
	
	for (int i=1; i<10; i++) {
		
		if (i==5 || i==6 || i==7) {
			continue;
		} 
		System.out.println(i);
	} 
	
	
	
	}

}
