package com.syntax.class21;

public class userClass {
	
	//Write program: userClass  that has a constructor that initializes instance 
	//variable name and mobile number. Create a subclass  userInfo that will 
	//have user address variable and it also being initialized through constructor call.
	//Print users name, mobile number and address in userDetails method. Test your code.
	
	String name;
	int mobileNumber;
	
	public userClass(String name, int mobileNumber) {
		this.name=name;
		this.mobileNumber=mobileNumber;
	}

}

class userInfo extends userClass {
	
	String addres;
	
	userInfo (String name, int mobileNumber,String addres) {
		
		super(name,mobileNumber);
		this.addres=addres;
	}
	public void userDetails() {
			System.out.println(name+"'s phone number is "+mobileNumber+" and his/her address is "+addres);
		}
		
	}
	
	
	
	
	

