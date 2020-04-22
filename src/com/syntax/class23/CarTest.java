package com.syntax.class23;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car bmw=new BMW("BMW");		
		Car mers=new Mercedes("Mercedes");		
		Car tesla=new Tesla("Tesla");
		
		Car[] cars = {new BMW("BMW"), new Mercedes("Mercedes"), new Tesla("Tesla")};
			
		for(Car c:cars) {
			c.display();
			c.start();
			System.out.println("------------------");
		}
		
		for (int i=0; i<cars.length;i++) {
			cars[i].display();
			cars[i].start();
			
		}
		
 	}

}
