package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		 
		/* Take age input from a user and then based on the age print output
		 * if age is from 0-3 --> you are a baby
		 * if age is from 4-5 --> you are a kid
		 * if age is from 6-12 --> you are a child
		 * if age is from 13-19 --> you are teenager
		 * if age is from 20-64 --> you are an adult
		 * if age is more or equal to 65 --> you are a senior */
		
		// 1- Let's declare all variables
		
		int age;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your age");
        age=scan.nextInt();
        
        if (age>=0 && age<=3) {
        	System.out.println("baby");
        } else if (age>=5 && age<=5) {
        	System.out.println("kid");
        } else if (age>=6 && age<=12) {
            System.out.println("child");
        } else if (age>=13 && age<=19) {
        	System.out.println("teenager");
        } else if (age>=20 && age<=64) {
        	System.out.println("adult");
        } else {
        	System.out.println("You are enjoying your life");
        }
	}

}
