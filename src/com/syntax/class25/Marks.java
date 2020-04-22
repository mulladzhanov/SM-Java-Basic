package com.syntax.class25;

public abstract class Marks {
	
	int one, two,three,four;
	
	 Marks(int one, int two, int three, int four) {
		
		this(one, two, three);
		this.four=four;
		
	}
     Marks(int one, int two, int three) {
    	 
    	this.one=one;
 		this.two=two;
 		this.three=three; 

		
	}
	
	//We have to calculate the average of marks obtained in three subjects by student A and by student B. 
	//Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks. 
	//Provide implementation of abstract method in classes ‘A’ and ‘B’. The constructor of student 
	//A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
	
	abstract int getPercentage();
	
}

class A extends Marks {
	
	
	
	A(int one, int two, int three){
		
		super(one,two,three);
		
	}

	@Override
	int getPercentage() {
		
		int a=(one+two+three)/3;
		
		System.out.println(a+"%");
		
		return a;
	}
	
}

class B extends Marks {
	
	B(int one, int two, int three, int four) {

	    super(one,two,three,four);
		
		
	}

	@Override
	int getPercentage() {
		
		int a=(one+two+three+four)/4;
		System.out.println(a+"%");
		
		
		return a;
	}
	
	
}
