package com.syntax.class07;

public class hwkLoop3 {

	public static void main(String[] args) {
		
		int a=20;
		
		while (a<=49) {
			System.out.println(++a);
			
			a+=1;
		}
         System.out.println("----------2-----------");
	
	    int b=20;
	    
	    while (b<=50) {
	    	if (b%2!=0) {
	    		System.out.println(b);
	    		
	    	} b++;
	    }
	System.out.println("--------FOR------------");
	
	for (int c=20; c<=49; c++) {
		System.out.println(++c);
	}
	}

}
