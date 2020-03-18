package com.syntax.class11;

public class StringVerifications {

	public static void main(String[] args) {
		
		String message="Welcome Admin";
		
		//verify that message contains username which is Admin
		
		System.out.println(message.contains("Admin"));
		
		boolean flag=message.contains("Welcome");
		System.out.println(flag);
		
		
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);

		
		String username="Admin";
		
		boolean ends=message.endsWith(username);
		System.out.println(ends);
		
		
	
		
	}

}
