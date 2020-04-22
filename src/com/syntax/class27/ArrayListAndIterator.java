package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {
	
	public static void main(String[] args) {
		
		// Create an Array list of Chocolate
		
		ArrayList<String> choco=new ArrayList<>();
		choco.add("Kinder");
		choco.add("Godiva");
		choco.add("Kit Kat");
		choco.add("Snikers");
		
		// Create an Array list of Sweet
		
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("Ice cream");
		sweets.add("Cheese cake");
		sweets.addAll(choco);
		
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		System.out.println("-----------------");
		
		// We want to Iterate through the collection
		
		Iterator<String> it=sweets.iterator();
		
		while(it.hasNext()) {
			String element=it.next();
			System.out.print(element);
			
			
		}
		    System.out.println();
		    System.out.println("-----------------");
		
		
		// I want to get elements backwards
		
		for(int i=sweets.size()-1; i>=0; i--) {
			System.out.print(sweets.get(i)+": ");
		}
		
		
	}

}
