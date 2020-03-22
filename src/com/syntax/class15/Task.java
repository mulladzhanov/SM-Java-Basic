package com.syntax.class15;

public class Task {
	
	void numbers(int a,int b) {
		
		int l;
		
		if (a>b) {
			l=a;
		} else {
			l=b;
		}
		
		System.out.println("The largest is "+l);
		
	}
	
	void evenOrOdd (int a) {
		
		String eo;
		
		if(a%2==0) {
			eo="Even";
		} else {
			eo="Odd";
			
		} 
		System.out.println("The number is "+eo);
	}
	
	void pal(String a) {
		
		char[] array=a.toCharArray();
		String rev="";
		
		for (int i=array.length-1; i>=0; i--) {
			
			rev+=array[i];	
		}
		if (rev.equalsIgnoreCase(a)) {
				System.out.println("The String "+a+" is a Palindrome");
			} else {
				System.out.println("The String "+a+" is not a Palindrome");
			}
			
			
		
	}
	
	
	void speaks(String country, String language) {
		
		switch (country) {
		case "Turkey" :
			language="turkish";
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Task one=new Task();
		
		one.numbers(65,40);
		one.evenOrOdd(50);
		one.pal("human");
	}

}
