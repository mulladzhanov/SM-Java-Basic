package com.syntax.class21;

public class Shape {
	
	/* Write program: Shape class has a constructor that takes the radius and has a 
	 * subclass as  circle class. In circle class create a method to calculate the
	 * area of circle. Test your code
	 */
	
	double radius, area;
	
//	Shape(int radius){
//	this.radius=radius;
//	}
	
public static void main(String[] args) {
		
		Circle obj=new Circle();
		obj.m(2);
	}
	
}

class Circle extends Shape {
	
//	Circle(int radius){
//		super(radius);
//	}
//	
	public void m (int radius) {
		super.radius=radius;
	area=(radius*radius)*3.14;
	System.out.println(area);	
		
	}
	
}
