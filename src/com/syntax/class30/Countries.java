package com.syntax.class30;

import java.util.*;

public class Countries {
	
	public static void main(String[] args) {
		
	
	
	Map<String, String> ct=new TreeMap<>();
	ct.put("USA", "Washington DC");
	ct.put("Russia", "Moscow");
	ct.put("China", "Beijing");
	ct.put("Tajikistan", "Dushanbe");
	ct.put("China", "Beijing");
	ct.put("France", "Paris");
	ct.put("Turkey", "Istanbul");
	
	System.out.println(ct);
	
	Iterator<String> key=ct.keySet().iterator();
	while(key.hasNext()) {
		System.out.println(key.next());
	}
	System.out.println("---- for -------");
	
	for(String c:ct.keySet()) {
		System.out.println(c);
	}
	
	System.out.println("---- values Iterator -------");
	
	Iterator<String> val=ct.values().iterator();
	while(val.hasNext()) {
		System.out.println(val.next());
	}
	System.out.println("---- values for loop -------");
	
	for (String v:ct.values()) {
		System.out.println(v);
	}
	
	
	

}
}