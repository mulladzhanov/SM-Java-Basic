package MyHomeWorks;

import java.util.Scanner;

public class Feb17CreditCard {
	
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	     
	     System.out.println("Do you have a credit card?");
	     
	     String a=scan.nextLine();
	     
	     if (a.equalsIgnoreCase("Yes")){
	    	 
	    	 System.out.println("What is the balance of the Creadit Card?");
	    	 int b=scan.nextInt();
	    	 
	    	 if (b>1000) {
	    		 
	    		 System.out.println("You should pay it off immediately!");
	    	 } else {
	    		 System.out.println("You may continue spending more");
	    	 }
	    	  
	     
	    
	     } else {
	    	 System.out.println("Would you like to apply for Credit Card now?");
	    String x=scan.nextLine();
	    
	    	 if (x.equalsIgnoreCase("Yes")) {
	    		 System.out.println("Please call the bank at +1 (800) 233 3333");
	    	 } else {
	    		 System.out.println("See you later!");
	    	 }
	     }
	
		
	}
}

