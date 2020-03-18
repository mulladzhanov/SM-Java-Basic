package ReviewClass;

import java.util.Scanner;

public class StringArrayScannerDemo {

	public static void main(String[] args) {
		
		Scanner x=new Scanner (System.in);
		System.out.println("How many animals do you have?");
		
		int length = x.nextInt();
		
		String[] animals = new String[length];
		
			
		for (int count=0; count < length; count++) {
			
			System.out.println("Give me the name");			
	    	String name=x.nextLine();	    	
	    	animals[count]=name;	    	
		
		}
		
		System.out.println("---------------------");
		
		for (String name2:animals) {
			System.out.println(name2);
		}
		
////// ASK THIS FROM SOMEONE !!!!!!!
		
		
		
	}

}
