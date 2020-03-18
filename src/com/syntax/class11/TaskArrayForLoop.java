package com.syntax.class11;

public class TaskArrayForLoop {

	public static void main(String[] args) {
		
		String[][] cars = { {"Jeep", "GMC", "Ford"},
				            {"Mercedes", "BMW", "Audi"},
				            {"Hyudai","KIA"},
				            {"Ferari", "Lamborghini", "Maserati"}
		};
		
		for (String[] country:cars) {
			
			for (String car: country ) {
				
				System.out.print(car+" ");
			}System.out.println();
		}
		System.out.println("------------2-----------");
		for (int a=0; a<cars.length; a++) {
			for (int b=0; b<cars[a].length; b++) {
				
				System.out.print(cars[a][b]+" ");
			} System.out.println();
		}

	}

}
