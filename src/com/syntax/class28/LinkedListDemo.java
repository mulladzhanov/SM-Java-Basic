package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> llist=new LinkedList<>();
		
		llist.add("Yunus");
		llist.add(0,"Reyhan");
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");
		llist.removeAll(llist);
		
		int size=llist.size();
		System.out.println(size);
		
		System.out.println("-------------------");
		
		for (String l:llist) {
			System.out.print(l+" ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		for (int i=0; i<llist.size(); i++) {
			String str=llist.get(i);
			System.out.print(str+" ");
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		Iterator<String> it=llist.iterator();
		
		while (it.hasNext()) {
			String str1=it.next();
			System.out.print(str1+" ");
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		LinkedList<Food1> food= new LinkedList<>();
		food.add(new Oatmeal("Milk"));
		food.add(new Chicken("Chicken breast"));
		food.add(new Yogurt("Yogurt"));
		
		for(Food1 str:food) {
			str.cal();
			
			str.pro();
			
		}
		
		
		
		
		
		
		
		
	}

}
