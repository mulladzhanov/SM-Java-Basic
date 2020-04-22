package com.syntax.class26;

public class Registration {
	
	private String email;
	private String userName;
	private String password;
	
	// SETTERS
	
	public void setEmail(String email) {
		
		if(email.endsWith("@yahoo.com")) {
			this.email=email;
		} else {
			System.out.println("Email should be @yahoo.com");
		}
					
	}
	
	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if(userName.length()>6) {
				this.userName=userName;
			} else {
				System.out.println("Username is short");
			}
		} else {
			System.out.println("Username is empty");
		}
	}
	
	public void setPassword(String password) {
		
		if(!password.isEmpty()) {
			if (password.length()>6) {
				if(!password.contains(userName)) {
					this.password=password;
				} else {
					System.out.println("Password contains Username");
				}
			} else {
				System.out.println("Password is short");
			}
		} else {
			System.out.println("Password is emplty");
		}
		
	}
	
	// GETTERS
	
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}

}
