package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		//Declare date and a day.
		// If day is Friday --> if date is 13 --> watch a scary movie
		//                  --> If date is not 13 --> watch comedy
		//

		boolean isFriday=true;
		int date=14;
		
		if (isFriday) {
		System.out.println("Today is Friday, i am going to watch a movie");
			
			if (date==13) {
			System.out.println("I will watch scary a movie");
		} else {
			System.out.println("I will watch a comedy");
		}
	} else {
		System.out.println("Today is not Friday, i am staying home");
	}
	
	
	
	}

}
