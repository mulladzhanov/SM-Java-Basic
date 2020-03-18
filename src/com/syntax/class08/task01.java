package com.syntax.class08;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		
		int even=0;
		int odd=0;	
		int b=0;
		int a=0;
		
		System.out.println("Enter range");
		 a=s.nextInt();
	     b=s.nextInt();
		
		for ( a=a; a<b; a++) {
			
					
			if (a%2==0) {
				even=even+a;				
			} else {
				odd=odd+a;		
			} 
			
		} System.out.println(even);
		  System.out.println(odd);	
		

	}

}
