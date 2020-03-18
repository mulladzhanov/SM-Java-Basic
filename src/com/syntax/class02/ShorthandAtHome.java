package com.syntax.class02;

public class ShorthandAtHome {

	public static void main(String[] args) {

		double x = 2.5;
		double y = 3.6;

		double z = y - x;

		System.out.println("The subtraction of 2 numbers " + y + " and " + x + " is equal to " + z);

		double a = 3.9, b;
		b = a * a;

		System.out.println("The square of the " + a + " is " + b);

		int w = 5, h = 8, k, l;

		k = w * h;
		l = w * 2 + h * 2;

		System.out.println("The perimeter of a rectangular with width " + w + " and height " + h + " is equal to " + l
				+ " and the area is " + k);

		int s = 33;
		int t = 5;

		int remainder = s % t;

		System.out.println(remainder);

		int a1=60;
		a1+=40;
		
		System.out.println(a1);
		 
		int b2=80;
		b2-=13;
		 
		System.out.println(b2);
		
		int cakePiece=11;
		cakePiece/=4;
		
		System.out.println(cakePiece);
		
		cakePiece=25;
		
		cakePiece%=7;
		
		
		
		System.out.println(cakePiece);
		
		
		
		
	}

}
