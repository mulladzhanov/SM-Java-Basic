package com.syntax.class23;

public class ComputerTest {
	
	public static void main(String[] args) {
		
	
	
	Computer[] comps= {new Apple(1200,"Apple"),new Lenovo(1000,"Lenovo"),new HP(800,"HP"),new Dell(600,"Dell")};
	
	for(Computer x: comps) {
		x.m();
		x.watch();
		
		System.out.println("------");
		
	} 
	}
}
