package com.syntax.class26;

public class Doctor {
	
	private long licenseID;
	private long phone;
	private String email;
	
	public void setEmail(String email) {
		
		if (!email.isEmpty()) {
			if(email.contains("gmail")) {
		this.email=email;
			}else {
				System.out.println("Email must be of gmail type");
			}
		} else {
			System.out.println("Email can't be empty");
		}
	}
	
	public void setLicenceId(long licenseID) {
		
		if(licenseID>8) { 
			if (licenseID<15) {
				this.licenseID=licenseID;
			} else {
				System.out.println("ID is too long");
			}
				
			} else {
				System.out.println("ID is too short");
			}
		}
		
	
	
	public String getEmail() {
		return email;
	}
	public long getLicenseId() {
		return licenseID;
	}

}
