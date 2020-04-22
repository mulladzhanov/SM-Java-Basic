package com.syntax.class22;

public class CreditCard {
	
	int balance, interest;
	
	CreditCard(int balance) {
		this.balance=balance;
		
	}
	
	public double calInt() {
		if (balance>1000) {
			interest+=balance*0.2;
		} else {
			interest+=0;
		} 
		return interest;
	} 

}
    
class Visa extends CreditCard {
	
	
	Visa(int balance) {
		super(balance);
		
	}
	@Override
	public double calInt() {
		if (balance>1000) {
			interest+=balance*0.3;
		} else {
			interest+=0;
		}
		
		System.out.println(interest);
		
		return interest;
	
	}	
}
class MC extends CreditCard{
	
	MC(int b) {
		super(b);
	
	}
	
	public double calInt(int a) {
		if (balance>1000) {
			interest+=balance*0.3;
		} else {
			interest+=0;
		}
		
		System.out.println(interest+" "+a);
		
		return interest;
	
	}	
}
