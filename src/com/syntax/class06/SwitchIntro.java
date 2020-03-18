package com.syntax.class06;

import java.util.Scanner;

public class SwitchIntro {

	public static void main(String[] args) {
		
		Scanner scan;
		
		scan=new Scanner (System.in);
		
		int day=5;
		
		String today;
		switch (day) {
		
		case 1:
		today="Monday";
		break;
		
		case 2:
		today="Tuesday";
		break;
		
		case 3:
		today="Wednesday";
		break;
		
		case 4:
		today="Thursday";
		break;
			
		case 5:
		today="Friday";
		break;
		
		case 6:
		today="Saturday";
		break;
			
		case 7:
		today="Saturday";
		break;
			
		default:
		today="Invalid";
				
			
		}
		System.out.println("Today is "+today);
	}

}
