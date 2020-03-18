package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		
Scanner scan;
scan=new Scanner(System.in);


String sale;
double price=0;
double discount=0;
double finalPrice;

  System.out.println("Is there any sale?");
  sale=scan.nextLine();
  
  
  
  if (sale.equalsIgnoreCase("yes")) {
	  
	  System.out.println("WHat is the price?");
	  price=scan.nextDouble();
      
			  if (price<20) {
        	discount=price*0.1;
        } else if (price>=20 && price<100) {
        	discount=price*0.2;
        } else if (price>=100 && price<=500) {
	        discount=price*0.3;
        } else if (price>500) {
        	discount=price*0.5;
        }
        
        finalPrice=price-discount;
		
        System.out.println("After "+discount+" discount the price of the item reduced from "+price+" to "+finalPrice);
  
  } else {
		  System.out.println("Not going shopping");
	  }

	}

}
