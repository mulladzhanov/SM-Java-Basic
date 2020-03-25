package com.syntax.class15;

public class hwk {

	public static void main(String[] args) {
		
		
		hwk obj=new hwk();
		obj.a("Jaga", "Kuvvatov");
		obj.a("frank", "THOMAS");
		
		
		
   
		
		
		
		

	}

	String a (String name, String lastName) {
		
		name=name.toLowerCase();
		lastName=lastName.toLowerCase();
		
		String email=name.concat(lastName);
		
		System.out.println(email+"@gmail.com");
		
		return email;
		
	} 
	
	
	
	
	
}
