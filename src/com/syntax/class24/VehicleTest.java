package com.syntax.class24;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		
		Vehicle obj=new Tesla("Black","SUV","Tesla");
		obj.start();
		obj.drive();
		obj.brake();
		obj.stop();
		
		
		new Toyota("White","Sidan","Toyota");
		new Toyota("Pink","Coupe","Toyota");
		
		System.out.println(Vehicle.totalVehicle);
		
		
		

		
	}

}
