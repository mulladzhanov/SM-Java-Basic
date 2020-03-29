package com.syntax.class17;

public class RecapStaticKeyword {
	
	// create a template for a Phone 
	
	String color;	
	int memory;

	
	
	static String brand;
	static boolean touchscreen;
	
	// return type, name, parameters.
	
	static void displayGeneralInfo() {
		
		System.out.println("We are building "+brand+" with touch screen "+touchscreen);
		
	}
	
	void displaySpecifications () {
		
		System.out.println("We build phone with "+memory+"GB memory in "+color+" color");
	}
	
	public static void main(String[] args) {
		
		brand="iPhone";
		touchscreen=true;
		
		
		// accessing instance variables through the instance of the class
		
		RecapStaticKeyword obj =new RecapStaticKeyword();
		obj.color="grey";
		obj.memory=64;
		
		// accessing static method in a static way
		
		displayGeneralInfo();
		obj.displaySpecifications();
		obj.displayGeneralInfo(); // Valid but not preferable 
		

		
	}
	

}
