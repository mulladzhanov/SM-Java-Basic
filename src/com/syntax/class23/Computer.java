package com.syntax.class23;

public class Computer {
	
	int price;
	String name;
	
	public Computer(int price, String name) {
		this.price=price;
		this.name=name;
	}
	
	public void watch() {
		System.out.println("The price of "+name+" is "+price+", we can watch HD");
	}
	
	public void m() {
		System.out.println("I love "+name);
	}

}

class Apple extends Computer{
	
	Apple(int price,String name) {
		super(price,name);
	}
	

	public void watch() {
		System.out.println("The price of "+name+" is "+price+", we can watch 4K");
	}
	
	public void code() {
		System.out.println("Write codes");
	}
	
}

class Lenovo extends Computer{
	
	Lenovo(int price,String name) {
		super(price,name);
	}
	

	public void watch() {
		System.out.println("The price of "+name+" is "+price+", we can watch UHD");
	}
	
	public void play() {
		System.out.println("Play games");
	}
	
}

class HP extends Computer{
	
	HP(int price,String name) {
		super(price,name);
	}
	

	public void watch() {
		System.out.println("The price of "+name+" is "+price+", we can watch HD");
	}
	
	public void tablet() {
		System.out.println("You can use it as a tablet");
	}
	
}

class Dell extends Computer{
	
	Dell(int price, String name){
		super(price,name);
	}
	
	public void watch() {
		System.out.println("Not recomended to watch movies");
	}
	
	public void work() {
		System.out.println("You can take it to work");
	}
	
}
