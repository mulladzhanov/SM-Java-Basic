package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
//		for (int a=1; a<=9; a++) {
//			for (int b=0; b<=9; b++) {
//				System.out.println(a+""+b);
//			}
//		}

		
		
		
		for (int x=0; x<24; x++) {
			for (int y=0; y<60; y++) {

				 if (y<10) {
						System.out.println(x+":"+0+y);
				
				} else {
					System.out.println(x+":"+y);
					
				}
			}
		}
		System.out.println("------------------------");
		
		
		
		for (int a=0; a<10; a++) {
			for (int b=0; b<10; b++) {
				for (int c=0; c<10; c++) {
					for (int d=0; d<10; d++) {
						System.out.println(a+"-"+b+"-"+c+"-"+d);
					}
				}
			}
		}
		
	}

}
