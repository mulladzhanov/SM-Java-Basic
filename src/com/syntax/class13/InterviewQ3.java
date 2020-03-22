package com.syntax.class13;

public class InterviewQ3 {

	public static void main(String[] args) {
		

		/* 
		 * Write JP to print 10 numbers of Fibonacci series
		 * 
		 * 0+1=2=3=5=8=13=21=34
		 */

		
		int a,b,c;
		a=0;
		b=1;
		
		for (int i=0; i<=10; i++) {
			
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
	
	}

}
