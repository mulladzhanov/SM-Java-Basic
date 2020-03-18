package MyHomeWorks;

import java.util.Scanner;

public class ReplIt {

	public static void main(String[] args) {
	  
		    Scanner x=new Scanner (System.in);
		    
		    System.out.println("Please enter your gender:M or F");
		    String a=x.nextLine();
		    
		    System.out.println("Please enter your age:");
		    int b=x.nextInt();
		    
		    if (a.equals("F")) {
		    	
		    	
		    	if (b<25) { 
		    		System.out.println("Girl");
		    		
		    	} else {
		    		System.out.println("Woman");
		    	}
		    } else if (a.equals("M")) {
		    	
		    
		    	if (b<25) {
		    		System.out.println("Boy");
		    	} else {
		    		System.out.println("Man");
		    	}
		    }
	  }
	}