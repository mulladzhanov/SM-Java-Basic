package com.syntax.class04;

import java.util.Scanner;

public class InClassTaskForScanner {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the amount you want for the loan");
		int loan=scan.nextInt();
		
		if (loan<200000) {
			System.out.println("Congratulations. You are approved to get loan for "+loan);
		} else {
			System.out.println("You are declined to get loan");
		}
		
		
		System.out.println("----------------------------");
	
	
	System.out.println("What is your age?");
	int age=scan.nextInt();
	if (age >=18) {
		System.out.println("You are eligible to apply for drivers licence");
	}else {
		System.out.println("Please go ahead and get learners permit");
	}
	
	System.out.println("--------------------------");
	
	System.out.println("Please enter your city");    
    String city=scan.nextLine();
    
    
    
    System.out.println("What is the temperature in "+city+"?");
    int fahrenheit=scan.nextInt();	    
    int celsius=((fahrenheit-32)*5/9);
    
    
    System.out.println("The temperature in the "+city+" is "+celsius);

	
	}
	

}
