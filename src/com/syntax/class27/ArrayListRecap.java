package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {
	
	public static void main(String[] args) {
		
		// Array List that stores double type objects
		// generic arrays
		
		ArrayList<Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		
		System.out.println(alist);
		
		//replace element
		
		alist.set(1, 13.90);
		System.out.println(alist);
		
		//remove element
		
		alist.remove(13.9);
		System.out.println(alist);
		
		//retrieve single element
		
		System.out.println(alist.get(1));
		
		System.out.println("-------------");
		
		//retrieve all elements from collection
		
		for(double a:alist) {
			System.out.println(a);
		}
		
		System.out.println("-------------");
		
		// 2nd way 
		
		for (int i=0; i<alist.size(); i++) {
			double d=alist.get(i);
			System.out.println(d);
		}
		
		System.out.println("-------------");
		
		
		// 3rd way ITERATOR
		
		Iterator<Double> iter=alist.iterator();
		while(iter.hasNext()) {
			double d=iter.next();
			System.out.println(d);
		}
		
		
		System.out.println("-------------");
		
		// 2 non generic collection / arrayList
		
		ArrayList obj=new ArrayList();
		obj.add("hello"); //store single object
		obj.add(100);
		obj.add('c');
		obj.addAll(alist); //store collection object
		
		System.out.println(obj);

		System.out.println("-------------");
		
		//retrieve all elements from collection
		
		for(Object o:obj) {
			
			System.out.println(o);
			
		}
		
		
		
	}

}
