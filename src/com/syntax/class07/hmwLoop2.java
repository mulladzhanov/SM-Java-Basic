package com.syntax.class07;

public class hmwLoop2 {

	public static void main(String[] args) {
		
		
		int a=20;
		
		while (a>=1) {
			
			System.out.println(a--);
            a--;
	}
	
	System.out.println("-----------2------------");
	
	int b=20;
	
	while (b>=1) {
		System.out.println(b);
		b-=2;
	}
	System.out.println("-------------3-------------");
	
	int c=20;
	
	while (c>=1) {
		if (c%2!=1) {
			System.out.println(c);}
		c--;
	}
	
	
	}
}
