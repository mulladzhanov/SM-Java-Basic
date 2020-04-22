package com.syntax.class25;

public class CarTest {

	public static void main(String[] args) {
		

		Car sedan=new Sedan(10000,10);
		sedan.calculateSalePrice();
		
		Car truck=new Truck(10000,5000);
		truck.calculateSalePrice();

	}

}
