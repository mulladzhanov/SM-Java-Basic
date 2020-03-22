package com.syntax.class13;

public class InterviewQ5 {

	public static void main(String[] args) {
		
		/*
		 * Reverse string character by character
		 * word by word
		 * 
		 */
		

		String a="I love Java";
		String reversed="";
		
		for (int i=a.length()-1; i>=0; i--) {
			reversed=reversed+a.charAt(i);
					
			
		} System.out.println("Reversed String: "+reversed);
		
		
		String[] array=a.split(" ");
		String reversedWords="";
		
		for (int i=array.length-1; i>=0; i--) {
			
			reversedWords=reversedWords+array[i]+" ";
			
		} System.out.println(reversedWords);
		
		
		

	}

}
