package com.syntax.class04;

public class Task01 {

	public static void main(String[] args) {

		boolean hasDiploma = true;
		boolean degree = true;
		double scoreGpa = 4.4;

		if (hasDiploma) {
			System.out.println("Congratulations");
		
			if (degree) {
				System.out.println("Check GPA score");

				if (scoreGpa >= 3.5) {
					System.out.println("You are eligible for scholarship");
				} else {
					System.out.println("You should study harder");
				}
			}
		}else {
			System.out.println("Get the degree");  

		}
			
			System.out.println("-----------------------------");
          
		
         double mortgageRate=5.8;
         int mortgagePrice=30000;
         
         if (mortgageRate>4.5) {
        	 System.out.println("Do not buy a house");
         } else {
        	 System.out.println("Buy a house");
        	 
        	 if (mortgagePrice>200000) {
        		 System.out.println("Get a Loan");
        	 } else {
        		 System.out.println("Pay Cash");
        	 }
         }
	
	}
}
