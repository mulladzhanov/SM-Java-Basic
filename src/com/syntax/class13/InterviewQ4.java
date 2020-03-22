package com.syntax.class13;

public class InterviewQ4 {

	public static void main(String[] args) {
		

		/*
		 * Find out how many alpha characters are present in a String?
		 * Find number of words in string?
		 */
          
		String str = "Hih9895993bdjdsgfs&^*%%%   O*i0   ";
		str=str.replace("[^A-Za-z]","");
		int number=str.length();
		System.out.println("Number of alpha character = "+number);
		
		
		String a="Today is Wednesday and it is Java Class";
		String[] array=a.split(" ");
		int words=array.length;
		
		System.out.println("Total words in string "+a+" is "+words);
	
	
	
	
	}

}
