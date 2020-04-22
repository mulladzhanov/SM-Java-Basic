package com.syntax.class21;

public class Area {
	
	int area;
	
	
	public void m(int a,int b) {
		area=a*b;
		
		System.out.println(area);
	}
	
	public void m(int a) {
		
		area=a*a;
		
		System.out.println(area);
		
	}
	
	public void m(int a, int b, int c) {
		
		area=a*b*c;
		
		System.out.println(area);
		
	}
	
	public static void main(String[] args) {
		
		Area obj=new Area();
		obj.m(2,4,6);
		obj.m(2);
		obj.m(2,4);
		
		
	}

}
