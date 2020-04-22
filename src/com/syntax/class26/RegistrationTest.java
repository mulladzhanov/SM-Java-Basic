package com.syntax.class26;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
	
	
	Registration reg=new Registration();
	reg.setEmail("jaga@gmail.com");
	reg.setEmail("jaga@yahoo.com");
	System.out.println(reg.getEmail());
	
	System.out.println("----------");
	
	reg.setUserName("");
	reg.setUserName("Jaga01");
	reg.setUserName("Jaga0111");
	System.out.println(reg.getUserName());
	
	System.out.println("-----------");
	
	reg.setPassword("");
	reg.setPassword("jaga12");
	reg.setPassword(reg.getUserName());
	reg.setPassword("jaga1010");
	System.out.println(reg.getPassword());
	
	
	
	
	

}
}