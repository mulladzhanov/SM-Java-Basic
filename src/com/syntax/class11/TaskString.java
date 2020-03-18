package com.syntax.class11;

public class TaskString {

	public static void main(String[] args) {
		
		String username;
		String password;
		String confirm;
		String message;
		
		
		System.out.println("");
		
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
			
			if (password.length()<8) {
				
				System.out.println("Password is too short");
		} 		
		}
		
		if (password.contains(username)) {
		System.out.println("Password cannot contain Username");
		}
		
		if (confirmedPassword.equals(password)) {
		
		} else {
			System.out.println("Passwords do not match");
		}
		System.out.println("Your username and password are created");
		
		
		
		
		
		
		
		
		
		

	}

}
