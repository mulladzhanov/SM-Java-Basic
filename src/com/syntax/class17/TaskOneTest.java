package com.syntax.class17;

import java.util.Scanner;

public class TaskOneTest {

	public static void main(String[] args) {
		
		TaskOne obj=new TaskOne();
		
		int[] b= {12,4,8};
		System.out.println(obj.par(b));
		
		System.out.println("Enter the name");
		
		Scanner scan=new Scanner(System.in);
		String x=scan.nextLine();
		
		TaskOne.par2(x);
		
		
		
		

	}

}
