package com.syntax.class26;

public class DoctorTest {
	
	public static void main(String[] args) {
		
	
	
	Doctor doc=new Doctor();
	doc.setEmail("");
	doc.setEmail("doctor@hotmail.com");
	System.out.println(doc.getEmail());
	
	doc.setLicenceId(123456789);
	System.out.println(doc.getLicenseId());
	
	}
}
