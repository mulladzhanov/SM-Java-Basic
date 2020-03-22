package com.syntax.class13;

public class InterviewQ7 {

	public static void main(String[] args) {
		

		
		//Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		
		int[] a= {23,8,33,9,87,0,5};
		
		int s=a[0];
		int l=a[0];
		int l2=a[0];
		
		for (int i=0; i<a.length; i++) {
			
			if (a[i]>l) {
				l2=l;
				l=a[i];
			} else if (a[i]>l2) {
				l2=a[i];
			}
			if (a[i]<s) {
				s=a[i];
			}
			
			
		} System.out.println(s);
		System.out.println(l);
		System.out.println(l2);
		
		

		
		
		
		
		
		
	}

}
