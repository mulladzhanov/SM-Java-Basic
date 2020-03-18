package com.syntax.class01;

public class VariableDeclaration {
	
	public static void main(String[] args) {
		
		// crate a variable and store values
		// 1st way - declaring a variable and assigning a value 
		boolean b=true;
		// 2nd way - 1step declare variable
		//           2step assign a value
		
		int jaga;
		jaga=9000;
		
		// declare multiple variables and assign value later
		
		char w, x, y, z;
		
		w='L';
		x='O';
		y='V';
		z='E';
		
		
		// we cannot have variables with same name in 1 program
		// double i=12.99; Java will complain
		
		jaga=9700;
		// i reassigned the value above from 9000 to 9800
		
		System.out.print(w);
		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
		
		
	}

}
