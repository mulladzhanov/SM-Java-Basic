package com.syntax.class17;

import java.util.Scanner;

public class TaskOne {
	
	
	
	protected int par (int[] a) {
			
		int sum=0;
		
		for (int i=0; i<a.length; i++) {
			
		 sum+=a[i];
			
		}
		
		return sum;
	} 
	
	public static String par2 (String a) {
		
		String rev="";
		
		for (int i=a.length()-1; i>=0; i--) {
			
			rev+=a.charAt(i);		
			
		}
		System.out.println(rev);
		
		return rev;
		
		
	} 
	
	private static String par3 (String a) {
		
		String vowels=a.replaceAll("[^AaEeIiOoUuYy]", "");
		
		System.out.println(vowels);
		
		return vowels;
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word");
		String y=scan.nextLine();
		par3(y);
		
		
	}

}
