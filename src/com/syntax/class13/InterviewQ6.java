package com.syntax.class13;

public class InterviewQ6 {

	public static void main(String[] args) {
		
		// Write jp to find whether a String is palindrome or not?
		
		String str = "radar";
		
		//1way
		
		char[] a=str.toCharArray();
		
		String reverse="";
		
		System.out.println(reverse.isEmpty());
		
		for (int i=a.length-1; i>=0; i--) {
			reverse+=a[i];
		}
			System.out.println("word is "+str);
			System.out.println("reverse is "+reverse);
			
			if (str.equals(reverse)) {
				System.out.println("Yes word "+str+" is palindrome");
			} else {
				System.out.println("No word "+str+" is not palindrome");
			}
			
		

	}

}
