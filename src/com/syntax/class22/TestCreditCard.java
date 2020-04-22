package com.syntax.class22;

public class TestCreditCard {

	public static void main(String[] args) {
		Visa obj=new Visa(1100);
		obj.calInt();
		
		CreditCard obj2=new CreditCard(2000);
		obj2.calInt();
		
		MC obj1=new MC(1200);
		obj1.calInt(10);

	}

}
