package com.syntax.class05;

import java.util.Scanner;

public class TaskInClassLogicalOperators {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter your height");
		int a=x.nextInt();
		
		if (a<60) {
			System.out.println("short");
		} else if (a>=60 && a<=72) {
			System.out.println("medium");
		} else {
			System.out.println("tall");
		}

	System.out.println("---------- 2 -------------");
	
	
	System.out.println("What day is it?");
	int week=x.nextInt();
	
	if (week >=1 && week <=5 ) {
		System.out.println("It is a weekday");
	} else if (week==6 || week==7) {
		System.out.println(" It is a weekend");
	} else {
		System.out.println("Invalid day");
	}
	
	System.out.println("--------- 3 --------------");
	 
	
	System.out.println("Enter your quiz score");
	int quiz=x.nextInt();
	
	System.out.println("Enter your mid term score");
	int mid=x.nextInt();
	
	System.out.println("Enter your final score");
	int finalScore=x.nextInt();
	
	int grade=(quiz+mid+finalScore)/3;
	
	String gradeFinal;
	
	if (grade >=90) {
		gradeFinal="grade A";
	} else if (grade >=70 && grade<90) {
		gradeFinal="grade B";
	} else if (grade >=50 && grade <70) {
		gradeFinal="grade C";
	} else if (grade <50 ) {
		gradeFinal="grade F";
	} else {
		gradeFinal="grade Invalid";
	} System.out.println(gradeFinal);
	
	System.out.println("---------- 4 -------------");
		

	
	System.out.println("Enter your birth month");
	String month=x.nextLine();
	
	if ( month.equals("January") || month.equals("February") || month.equals("December")) {
	     month="Winter" ;
	} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
		month="Spring" ;
	} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
	    month="Summer";
	} else if (month.equals("September") || month.equals("October") || month.equals("Novermber")) {
		month="Autumn";
	} else {
		month="Invalid season";
		
	} System.out.println(month);
	

	
	
	
	}

	

}
