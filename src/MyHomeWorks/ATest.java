package MyHomeWorks;


import java.util.*;


public class ATest {
	
	public static void main(String[] args) {
		
		int a;

	    List<Integer> prime=new LinkedList<>();
	    
	    for(int i=2; i<100; i++) {
	    	
	    	a=0;
	    	
	    	for(int j=2; j<i; j++) {
	    		
	    		if (i%j==0) {
	    			a=1;
	    			break;
	    		}
	    	}
	    	
	    	if (a==0) {
	    	prime.add(i);
	    	
	    	}    	
	    	
	    }System.out.println(prime);
	    
	    
	      
	     
 
   
		    
}
}
