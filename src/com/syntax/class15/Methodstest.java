package com.syntax.class15;

public class Methodstest {

	public static void main(String[] args) {
	
		Methods obj=new Methods();
		obj.sayWelcome();
		obj.sayAnything("Hello", 2);
		obj.sayAnything("Bye", 4);
		//obj.sayAnything(12, "Hi"); CE
		
		obj.isItRaining(true);
		obj.isItRaining(false);

	}

}
