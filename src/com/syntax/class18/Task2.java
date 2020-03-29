package com.syntax.class18;

public class Task2 {
	
	
	public Task2() {
	    System.out.println("Public");
		
	}
	
	protected Task2(int num) {
		System.out.println("Protected");
	
		
	}
	Task2(int num,int num2) {
		System.out.println("Default");
	}
	
	private Task2(String str) {
		System.out.println("Private");
	}
	
	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		Task2 obj1=new Task2(12);
		Task2 obj2=new Task2(12,13);
		Task2 obj3=new Task2("Hi");
	}
	
	
	

}
