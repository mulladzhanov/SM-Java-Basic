package com.syntax.class19;

public class Task {
	
	//Write program as a Student class   that has instance variables name and address. Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.


	
	String name, adress;
	
	public Task (String name, String adress) {
		
		this.name=name;
		this.adress=adress;
		
		
	}
	
	public void displayInfo() {
		System.out.println("Students name is "+name+" and the address is "+adress);
	}
	
public static void main(String[] args) {
	
	Task obj=new Task("Jaga","14 River St, Woodbridge...");
	obj.displayInfo();
}
}
