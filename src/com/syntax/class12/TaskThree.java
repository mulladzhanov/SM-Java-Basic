package com.syntax.class12;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		
		String name1;
		String name2;
		
		

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Mom's first name: ");
		String mom=scan.nextLine();
		
		System.out.println("Enter Dad's first name: ");
		String dad=scan.nextLine();
		
		System.out.println("Boy or Girl: ");
		String g=scan.nextLine();
		
		if (g.equalsIgnoreCase("boy")) {
			name1=dad.substring(0,3).concat(mom.substring(2));
			System.out.println(name1);
		} else if (g.equalsIgnoreCase("girl")) {
			name2=mom.substring(0,2).concat(dad.substring(3));
			System.out.println(name2);
		} else {
			System.out.println("Please enter valid gender");
		}
		
		
		
		

	}

}
