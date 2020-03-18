package com.syntax.class12;

public class TaskOneTwo { 
	
	public static void main(String[] args) {
		
		String str="Sunday";
		char rev;
		
		
		for (int i=str.length()-1; i>=0; i--) {
			rev=str.charAt(i);		
			System.out.print(rev);
		
		}
		
		System.out.println("------------------");
		
		
		String str1="Coronavirus";
		
		if (!(str1.isEmpty())) {
			if ((str1.length()%2==1) && str1.length()>=3 ) {
			System.out.println(str1.charAt(str1.length()/2));
			}
			
				
					
					
					
				
			}
			
		
		
		
		
		
		
	}

}
