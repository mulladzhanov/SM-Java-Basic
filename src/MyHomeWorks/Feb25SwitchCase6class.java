package MyHomeWorks;

import java.util.Scanner;

public class Feb25SwitchCase6class {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your country");
        String country=scan.nextLine();
        String language;
        
        switch (country) {
       
        case "USA":
        	language="english";
            break;
        case "Russia":
        	language="russian";
        	break;       
        case "China":
        	language="chinese";
        	break;
        case "UAE":
        	language="arabic";
        	break;
        default:
        	language="unknown";
        }

	   System.out.println("They speak "+language);
	
	   System.out.println("-------------- 2 ---------------");
	   
	   System.out.println("Enter your grade:");
	   char grade;
	   String expl;
	    
	   grade=scan.next().charAt(0);
	   
	   switch (grade) {
	   
	   case 'A':
		   expl="Excelent";
		   break;
	   case 'B':
		   expl="Good";
		   break;
	   case 'C':
		   expl="Average";
		   break;
	   case 'D':
		   expl="Bad";
		   break;
		default:
			expl="Not Acceptable";   
		   
	   } System.out.println("The grade you entered is "+expl);
	  
	   System.out.println("-------------- HMW ---------------");
	   
	   System.out.println("Please enter 2 numbers");
	   int a=scan.nextInt();
	   int b=scan.nextInt();
	   String operator=scan.nextLine();
	   int result;
	     
	   switch (operator) {
	   
	   case "+":
		   result=a+b;
		   break;
	   case "-":
		   result=a-b;
		   break;
	   case "*":
		   result=a*b;
		   break;
	   case "/":
		   result=a/b;
		   break;
		   
	   
	   }
	   
	   
	   
	} 
	

}
