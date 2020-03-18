package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		
		int[] a= {200, 30, -1, 900, 56,787,3000};
		
		int largest=a[0];
		
		for (int x=1; x<a.length; x++) {
			
			if (a[x]>largest) {
				largest=a[x];
			}
			
		} System.out.println(largest);
	}

}
