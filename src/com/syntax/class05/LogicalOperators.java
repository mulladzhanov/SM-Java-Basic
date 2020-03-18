
package com.syntax.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		
		/* if declared number is 
		 * btw 1-10 --> this number is small 
		 * btw 10-100 --> this number is big
		 * btw 101-1000 --> this number is large
		 */
	    
		int num=200;
	
	if (num>1 && num<=10) {
		System.out.println("this number is small");
	} else if(num>10 && num<=100) {
	System.out.println("this number is big");
	
	} else if (num>100 && num<1000) {
		System.out.println("this number is large");
	} else {
		System.out.println("Number is super large");
	}
	
	}

}
