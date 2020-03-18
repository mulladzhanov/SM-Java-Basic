package com.syntax.class11;

public class Recap {
	
	public static void main(String[] args) {
		
		String[][] professions = { {"QA tester", "Developer", "PO", "Scrum Master"},
		                         {"Math teacher", "Sciece teacher", "ESL teacher"},
		                         {"Dentist", "Surgeon"}
		};
		
		// get elements using advance for loop
		
		for (String[] occupation: professions) {
			
			for (String title :occupation) {
				System.out.print(title+" ");
			}System.out.println();
		}
		
		
		
		
	}

}
