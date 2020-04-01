package com.syntax.class19;

public class Bicycle {
	
	//Java program to illustrate the  
	// concept of inheritance 
	  
	// base class 
    
	    public int gear; // the Bicycle class has two fields 
	    public int speed; 
	          
	    
	    public Bicycle(int gear, int speed) { // the Bicycle class has one constructor 
	     
	        this.gear = gear; 
	        this.speed = speed; 
	    } 
   
	    public void applyBrake(int decrement) { // the Bicycle class has three methods 
	     
	        speed -= decrement; 
	    } 
	          
	    public void speedUp(int increment) {
	     
	        speed += increment; 
	    } 
	    
	    public String toString()  {   // toString() method to print info of Bicycle 
	    
	        return("No of gears are "+gear 
	                +"\n"
	                + "speed of bicycle is "+speed); 
	    }  
	} 
	 
	class MountainBike extends Bicycle { // derived class   
	   
	    public int seatHeight;  // the MountainBike subclass adds one more field 
	  	    
	    public MountainBike(int gear,int speed, int startHeight) { // the MountainBike subclass has one constructor 
	          
	        super(gear, speed); // invoking base-class(Bicycle) constructor 
	        seatHeight = startHeight; 
	    }  
	          
	    // the MountainBike subclass adds one more method 
	    public void setHeight(int newValue) {
	     
	        seatHeight = newValue; 
	    }  
	      
	    // overriding toString() method 
	    // of Bicycle to print more info 
	    @Override
	    public String toString() {     
	        return (super.toString()+ 
	                "\nseat height is "+seatHeight); 
	    } 
	      
	}
	  
	
