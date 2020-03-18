package ReviewClass;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//1st way
	
		int[] numbers=new  int[5];
		
		numbers[3] = 9;
		numbers[1] = 5;
		numbers[2] = 34;
		numbers[4] = 4;
		numbers[0] = 70;
		
		
//		System.out.println(numbers[0]);		
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);		
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
		// System.out.println(numbers[5]); //will say error
	
	    int i = 2;	    
	    System.out.println(numbers[i]);
	    i++;
	    System.out.println(numbers[i]); 
	    
	    // A method ------------------------------------------
	    
	    System.out.println("----------------Using for Loop");
	   
	    int arrayLength = numbers.length;
	    
	    for (int j=0; j < arrayLength; j++) {
	    	System.out.println(numbers[j]);
	    }
	    
     
	     System.out.println("The length of the array is: "+ arrayLength);
	
	    // B method ------------------------------------------
	
	     System.out.println("------------Using for - each loop / Advanced / Enhanced");
	
	     for (int num : numbers) {
	    	 
	    	 System.out.println(num);	    	 
	     }
	     
	     // C method -----------------------------------------
	   
         System.out.println("-----------Using curly brackets");	     
	    
         int[] numbers2 = {4, 6, 8, 9, 15 };
         System.out.println("Length is "+numbers2.length);
         
         for (int j=0; j < numbers2.length; j++) {
        	 
        	 System.out.println(numbers2[j]);   
         }
	    
         System.out.println("------------------");
	     
	     for (int number : numbers2) {
	    	 System.out.println(number);	    	 
	     }
	     
	}

}
