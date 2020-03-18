package com.syntax.class11;

public class TaskTwoArrayForLoop {

	public static void main(String[] args) {
		
		String[][] countries = { {"USA", "Canada"},
	            {"Brazil", "Columbia", "Peru"},
	            {"England","Austria","italy"},
	            {"China", "Tajikistan", "Turkey"},
	            {"Egypt", "Nigeria", "South Africa" }
};
		int count=0;
		for (int a=0; a<countries.length; a++) {
			for (int b=0; b<countries[a].length; b++) {
				System.out.print(countries[a][b]+" ");	
				count++;
			} System.out.println();	
					
		} System.out.println(count); //Total countries

		
		
		System.out.println("---------------");

		
		int c=0;
       
		for (String[] a:countries) {
        	for (String b:a) {
        		System.out.print(b+" ");
        		c++;
        	}System.out.println();
        } System.out.println(c); //Total countries
	}

}
