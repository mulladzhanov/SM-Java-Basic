package com.syntax.class25;

public interface Shape {
	
	//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter. 
	//Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
	
	public void calculateArea(int r);
	public void calculatePerimeter(int r);
		

}

class Circle implements Shape {
		

	@Override
	public void calculateArea(int r) {
		
		double a=3.14*r*r;
		System.out.println(a);
		
	}

	@Override
	public void calculatePerimeter(int r) {
		
		double p=2*3.14*r;
		System.out.println(p);
		
	}
	
}
class Square implements Shape {

	@Override
	public void calculateArea(int b) {
		int a=b*b;
		System.out.println(a);
		
	}

	@Override
	public void calculatePerimeter(int b) {
		int p=4*b;
		System.out.println(p);
		
	}
	
}