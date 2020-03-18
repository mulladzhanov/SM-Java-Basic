package ReviewClass;

import java.util.Scanner;

public class ArrayAndScanner {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		
		
		System.out.println("Enter the size of array");
				
		int a=x.nextInt();
				
	
        int[] array=new int[a];
        
        ;    
		
	    for (int i=0; i < a; i++) {
	    	System.out.println("Enter values of arrays");
	    
	        int b=x.nextInt();
	        
	        array[i]=b;
	    //System.out.println(array[i]);
	    
	    
	    	
	    } System.out.println("Let's see what we get");
	    for (int d : array) {
	    	System.out.print(d+" ");
		} 

		
		
	}

}
