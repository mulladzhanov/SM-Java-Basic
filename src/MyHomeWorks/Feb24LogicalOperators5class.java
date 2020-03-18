package MyHomeWorks;

import java.util.Scanner;

public class Feb24LogicalOperators5class {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		double a=x.nextDouble();
		double b=x.nextDouble();
		double c=x.nextDouble();
		
		double largest;
		
		if (a>b && a>c) {
			largest=a;
			}
		else if (c>a && c>b) {
			largest=c;
			 
		}else {
			largest=b;
		}
System.out.println(largest);
	
	System.out.println("------------ 2 ------------");
	
	
	System.out.println("Enter any 3 numbers ");
	
	 a=x.nextDouble();
     b=x.nextDouble();
	 c=x.nextDouble();
	
	if (a>b) {
		
		if (a>c) {
			largest=a;
		}else {
			largest=c;
		}
		}else {
			if (b>c) {
				largest=b;
			} else {
				largest=c;
			}
			

			
		}	System.out.println(largest);
	
	
	}
	
	

}
