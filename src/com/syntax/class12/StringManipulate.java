package com.syntax.class12;

public class StringManipulate {

	public static void main(String[] args) {
		

		String str="Good Morning Student!";
		
		char letter1=str.charAt(6);
		System.out.println(letter1);
		
		
		char letter;
		
		for (int i=0; i<str.length(); i++) {
			letter=str.charAt(i);
			System.out.print(letter+" ");
		}
		System.out.println();

		System.out.println("---Index of function---");
		
		String name="Syntax Technologies";
		
		int index=name.indexOf("y");
		System.out.println(index);
		
		//int index=name.indexOf("o", 6);
		
		
		index=name.indexOf(" ");
		System.out.println(index);
		
		index=name.indexOf("Syntax");
		System.out.println(index);
		
		
		
		
	}

}
