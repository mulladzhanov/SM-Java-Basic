package com.syntax.class24;

abstract public class Vehicle {
	
	String color;
	static int totalVehicle;
	
	Vehicle(String color) {
		this.color=color;
		totalVehicle++;
	}
	
	public void drive() {
		System.out.println("Vehicle drives");
	}
	
	public void stop() {
		System.out.println("Vehicle stops");
	}
	 public abstract void start();
	 
	 public abstract void brake();

}

abstract class Car extends Vehicle{
	
	String carType;
	Car(String color, String carType){
		super(color);
		this.carType=carType;
	
	}
	
	@Override
	public void brake() {
		System.out.println(carType+" has brakes");
	}
	
}

class Tesla extends Car{
	
	String make;
	
	Tesla(String color, String carType, String make) {
		super(color,carType);
		this.make=make;		
	}

	@Override
	public void start() {
		System.out.println(make+" starts remotely");		
	}
	public void drive() {
		System.out.println(make +" drives on autopilot");
	}
	
	public void display() {
		System.out.println("We have "+color+" "+make+" "+carType);
	}
}

class Toyota extends Car{
	
	String make;
	
	Toyota(String color, String carType, String make){
	super(color,carType);
	this.make=make;
	}

	@Override
	public void start() {
		
    System.out.println(make+" starts keyless");
		
	}
	
	
}
