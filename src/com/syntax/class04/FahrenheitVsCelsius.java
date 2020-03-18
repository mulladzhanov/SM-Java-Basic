package com.syntax.class04;

import java.util.Scanner;

public class FahrenheitVsCelsius {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

	    System.out.println("Please enter your city");    
	    String city=scan.nextLine();
	    
	    System.out.println("What is the temperature in "+city+"?");
	    int fahrenheit=scan.nextInt();	    
	    int celsius=((fahrenheit-32)*5/9);
	    
	    
	    System.out.println("The temperature in the "+city+" is "+celsius);
	

	}

}
