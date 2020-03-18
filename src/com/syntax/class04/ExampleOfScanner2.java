package com.syntax.class04;

import java.util.Scanner;

public class ExampleOfScanner2 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		//Capture name from a user and print it the format
		//My name is ...
		
		
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("My name is "+name);
		
		System.out.println("How old are you?");
		int age=scan.nextInt();	
		System.out.println("My name is "+name+" and i am "+age);
		
		
		
	}

}
