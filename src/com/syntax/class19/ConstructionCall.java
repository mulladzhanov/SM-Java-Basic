package com.syntax.class19;

public class ConstructionCall {
	
	//Constructor chaining
	
	public ConstructionCall() {
		
		System.out.println("I am non argument constructior"); //1
	}

	public ConstructionCall(String str) {
		this();
		
		System.out.println("33"); //2
	}
	
	public ConstructionCall(String str, String str1) {
		this("Hello");
	System.out.println("44"); //3
	}
	
	
	public static void main(String[] args) {
		ConstructionCall obj=new ConstructionCall();
		
	}
	
	
}
