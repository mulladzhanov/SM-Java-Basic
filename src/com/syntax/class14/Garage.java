package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		
	// build individual objects	
		
		Car car1 =new Car();
		car1.make="Lambo";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		Car car2 =new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.year=2019;
		car2.color="Pink";
		
		Car car3=new Car();
		car3.make="123";
		car3.speed=200;
		
		//Print BMW
		System.out.println(car2.make);
		
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		
		System.out.println("========================");
		
		System.out.println("I drive "+car1.color+" "+car1.make);
		
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		// 
		
		// Create a Bike
		
		// new Bike(); --> Cannot create any New Bike without class
		
		

	}

}
