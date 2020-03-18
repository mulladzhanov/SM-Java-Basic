package com.syntax.class09;

public class patternNestedForLoop {

	public static void main(String[] args) {
		
		
		for (int a=1; a<=10; a++) {
			for (int b=1; b<=10; b++) {
				System.out.print("*");
			} System.out.println("-");
		}

		System.out.println("------------------------");
		
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=10; b++) {
				System.out.print("*");
			} System.out.println();
		}
	}
	

}
