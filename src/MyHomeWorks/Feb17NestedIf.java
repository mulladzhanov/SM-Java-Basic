package MyHomeWorks;

import java.util.Scanner;

public class Feb17NestedIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many years did you work?");
		int years=scan.nextInt();
		
		if (years>=5) {
			System.out.println("What is you annual salary?");
			int salary=scan.nextInt();
			
			if (salary>5000) {
				
				System.out.println("You are getting bonus 5000");
			}else {
				System.out.println("You are getting bonus 3000");
			}
		} else {
			System.out.println("You are not getting bonus");
		}
		
		
		

	}

}
