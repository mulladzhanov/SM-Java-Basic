package com.syntax.class12;

public class StringManipulationMore {
	
	public static void main(String[] args) {
		
		
		System.out.println("------ substring() Fuction ---");
		
		String str="Today is a rainy day";
		
		// get only "rainy day"
		
		String partialString = str.substring(6);
		System.out.println(partialString);
		
		// get only "Today"
		partialString = str.substring(0,5);
		System.out.println(partialString);
		
		//rainy
		partialString=str.substring(11,16);
		System.out.println(partialString);
		
		
	}

}
