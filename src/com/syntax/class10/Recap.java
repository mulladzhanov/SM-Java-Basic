package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
	
	String[] cities= {"Washington DC", "NY", "LA", "Paris", "Miami", "Dallas", "VA" };
	
	System.out.println("I live in "+cities[2]);
	
	int x=1;
	
	System.out.println("I live in "+cities[x]);
	
	x+=3;
	
	System.out.println("I moved to "+cities[x]);
	
	int arraySize=cities.length;
	
	System.out.println("Total elements "+arraySize);
	
	System.out.println(cities[arraySize-1]);
	
	for (int i=0; i<arraySize; i++) {
		System.out.println(cities[i]);
	}
	}

}
