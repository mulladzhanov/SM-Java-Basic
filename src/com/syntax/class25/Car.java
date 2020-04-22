package com.syntax.class25;

public abstract class Car {
	
	//Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() 
	//which should be returning a price of the car.
	
	//Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of  
	//calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned price car should 
	//include 10% discount, otherwise 20% discount.

	//The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
	//if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
   
	
	double carPrice;
	String color;
	
	Car(double carPrice) {
	this.carPrice=carPrice;
	}
	
	abstract double calculateSalePrice();
}

class Sedan extends Car {
	
	int length;
	
	Sedan(double carPrice,int length) {
		super(carPrice);
		this.length=length;
		
		
	}
	
	@Override
	double calculateSalePrice() {
		
		if (length>20) {
			carPrice=carPrice*0.95;
		}else {
			carPrice=carPrice*0.9;
		}
		
		System.out.println(carPrice);
			
		return carPrice;
	}
	
}

class Truck extends Car {
	
    int weight;
    
    Truck(double carPrice,int weight) {
    	super(carPrice);
    	this.weight=weight;
    }

	@Override
	double calculateSalePrice() {
		
		if (weight>2000) {
			carPrice=carPrice*0.9;
		} else {
			carPrice=carPrice*0.8;
		}
		
		System.out.println(carPrice);
		return carPrice;
	}
	
}
