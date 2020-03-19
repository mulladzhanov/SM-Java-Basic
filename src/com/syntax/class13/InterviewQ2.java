package com.syntax.class13;

public class InterviewQ2 {

	public static void main(String[] args) {
		

		/* 
		 * Write java program to check whether a given number is prime or not?
		 * 
		 * prime number should be greater than 1
		 * prime number (divisible by 1 and itself
		 */

		int a=4;
		
		boolean isPrime=true;
		
		if (a>1) {
			
			for (int i=2; i<a; i++) {
				
				if (a%i==0) {
					isPrime=false;
					
				}
				
			}			
			
		} else {
			isPrime=false;
			
		} System.out.println(a+" is "+isPrime);
		
		
		
	}

}
