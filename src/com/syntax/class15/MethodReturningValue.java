package com.syntax.class15;

public class MethodReturningValue {

	public static void main(String[] args) {
		
		// create a Str and basen in the length of the Str
		// we define whether Str is short or long
		
		
		String str="Hello ";
		int length=str.length();
		
		if (length>10) {
			System.out.println("Str is long");
		} else {
			System.out.println("Str is short");
		}

	// compare 2 numbers and then we identify whether largest
	//	number is even or odd
		
		Task obj=new Task();
		//int num=obj.numbers(10, 20); --> CE because the numbers doesnt return any value
		
	
		//	create a method that returns largest number from 2 given numbers
		
		
		MethodReturningValue newObj=new MethodReturningValue();
		int num=newObj.largest(13,12);
		
	}
	
	int largest(int a, int b) {
			int largest;
			
			if (a>b) {
				largest=a;
				
			System.out.println("The largest is "+largest);	
			
			} else {
				largest=b;	
				
		    System.out.println("The largest is "+largest);	
			
			} return largest;
			
					
		} 
	
		
	
	
	

}
