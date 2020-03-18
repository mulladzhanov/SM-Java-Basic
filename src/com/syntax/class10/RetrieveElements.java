package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		
		String[] animals= {"Cat", "Dog", "Donkey", "Monkey", "Elephant","Lion"};
		
		for (int i=0; i<animals.length; i++) {
			
			System.out.print(animals[i]+" ");
		} System.out.println();

	for (String a:animals) {
		System.out.print(a+" ");
	}
	
	
	System.out.println("----------Task2----------");
	
	int[] x= {1,2,3,4,5};
	
	int sum=0;
	
	for (int a=0; a<x.length; a++) {
		
		sum=sum+x[a];	
		
	} System.out.println(sum);
	
	
	System.out.println("----------Task3----------");
	
	
	String[] countries= {"USA", "Canada", "Brazil", "Italy", "China"};
	
	String capital=null;
	
	for (int i=0; i<countries.length; i++) {
		
		System.out.println(countries[i]);
		if (countries[i].equals("USA")) {
		capital="DC";
		} else if (countries[i].equals("Canada")) {
			capital="Ottawa";
		} else if (countries[i].equals("Brazil")) {
			capital="Brazilia";
		} else if (countries[i].equals("Italy")) {
			capital="Rome";
		} else if (countries[i].equals("China")) {
			capital="Beijing";
		} 
    	System.out.println(capital);
	} 
	  System.out.println("----------------2nd way---------------");
	
	for (String c:countries) {
		
		System.out.println(c);
		
		if (c.equals("USA")) {
			capital="DC";
			} else if (c.equals("Canada")) {
				capital="Ottawa";
			} else if (c.equals("Brazil")) {
				capital="Brazilia";
			} else if (c.equals("Italy")) {
				capital="Rome";
			} else if (c.equals("China")) {
				capital="Beijing";
			} System.out.println(capital);
	}
	
	
	
	
	
	
	} 
}
