package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {

		double numberOne = 10;
		double numberTwo = 10;

		if (numberOne > numberTwo) {
			System.out.println("Number one is larger than number 2");
		} else if (numberOne < numberTwo) {
			System.out.println("Number one smaller than number 2");
		} else {
			System.out.println("Numbers are equal");
		}

		System.out.println("--------------------");

		// Declare variable for a day and than based on the value we will provide output

		int day = 5;

		if (day == 1) {
			System.out.println("It is Monday, no class today");
		} else if (day == 2) {
			System.out.println("It is Tuesday, we have SDLC class");
		} else if (day == 3) {
			System.out.println("It is Wednesday, we have SDLC class");
		} else if (day == 4) {
			System.out.println("It is Thursday,we have review class");
		} else if (day == 5) {
			System.out.println("It is Friday, no class today");
		} else if (day == 6) {
			System.out.println("It is Saturdat, we have Java class");
		} else if (day == 7) {
			System.out.println("It is Sunday, we have Java class");
		} else {
			System.out.println("Invalid weekday");
		}
      
		System.out.println("--------------TASK--------------");
       
       
       int month=9;
       
       if (month==1) {
    	   System.out.println("Jan");
       } else if (month==2) {
    	   System.out.println("Feb");
       } else if (month==3) {
    	   System.out.println("Mar");
       } else if (month==4) {
    	   System.out.println("Apr");	   
       } else if (month==5) {
    	   System.out.println("May");
       } else if (month==6) {
    	   System.out.println("Jun");
       } else if (month==7) {
    	   System.out.println("Jul");
       } else if (month==8) {
    	   System.out.println("Aug");
       } else if(month==9) {
    	   System.out.println("Sep");
       } else if (month==10) {
    	   System.out.println("Oct");
       } else if (month==11) {
    	   System.out.println("Nov");
       } else if (month==12) {
    	   System.out.println("Dec");
       } else {
    	   System.out.println("Invalid Month");
       }
         System.out.println("----------------2--------------");
	
         int number=-2;
         
         if (number>0) {
        	 System.out.println("The number is Positive");
         } else if (number<0) {       
        	 System.out.println("The number is Negative");
         } else {
        	 System.out.println("The number is equal");
         } 
         
         System.out.println("--------------3------------");
         
         int numberA=53;
         
         if (numberA%2==0) {
        	 System.out.println("The number is Even");
         } else {
        	 System.out.println("The number is Odd");
         }
         
	
	}


}
