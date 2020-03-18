package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVerification {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		

		System.out.println("Please enter 1st number");
		int num1=scan.nextInt();
		
		System.out.println("Please enter 2nd number");
		int num2=scan.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		if (num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}else if (num2>num1) {
			System.out.println(num2+" is greater than "+num1);
		}else {
			System.out.println("The numbers are equal");
		}
	
	
	}
	

}
