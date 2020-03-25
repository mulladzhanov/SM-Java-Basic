package MyHomeWorks;

import java.util.Scanner;

public class Draft {
	
	public static void main(String[] args) {
		
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	    
	   
	   	
	   	String p="";
	   	
	   	for (int i=givenString.length()-1; i>=0; i--) {
	   	  
	   	  p+=givenString.charAt(i);
	   	  
	   	 	}  boolean a=false;
	   	  
	   	  if (p.replaceAll(" ","").equalsIgnoreCase(givenString.replaceAll(" ",""))) {
	   	    a=true;
	   	  } else {
	   	    a=false;
	   	  }
	   	 
	    System.out.println(a);
	
	}
	}