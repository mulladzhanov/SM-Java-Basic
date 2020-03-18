package com.syntax.class07;

import java.util.Scanner;

public class scannerAndLoop {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		String name;
		int a=1;
		
		int b=1;
		
		do  {
			System.out.println("What is your name");
			name=x.nextLine();
			a++;
			
			System.out.println("Good afternoon "+name); 
		} while (a<=5); 
		
		System.out.println("------------2--------------");
		
		while (b<=5) {
			System.out.println("What's your name?");
			name=x.nextLine();
			
			System.out.println("Good afternoon "+name);
			b++;
			
		}
		
		

	}

}
