package com.syntax.class29;

import java.util.*;

public class World {
	
	public static void main(String[] args) {
		
		Set<String> ctr=new TreeSet<>();
		ctr.add("USA");
		ctr.add("Russia");
		ctr.add("China");
		ctr.add("England");
		ctr.add("UAE");
		ctr.add("China");
		ctr.add("Italy");
		
		System.out.println(ctr);
		System.out.println("------------");
		
		for(String c:ctr) {
			System.out.println(c);
		}
		System.out.println("------------");
		
		Iterator<String> c=ctr.iterator();
		while(c.hasNext()) {			
			System.out.println(c.next());
		}
	}

}
