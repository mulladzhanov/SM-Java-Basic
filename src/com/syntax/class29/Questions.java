package com.syntax.class29;

import java.util.*;

public class Questions {
	
	public static void main(String[] args) {
		
	
	
	List<String> city=new ArrayList<>();
	
	city.add("DC");
	city.add("NewYork");
	city.add("Beijing");
	city.add("Rome");
	city.add("Dubai");
	city.add("Ashghabad");
	city.add("Beijing");
	city.add("DC");
	city.add("Rome");
	
	System.out.println(city);
	System.out.println("------------");
	
	// Remove duplicates from the array
	
	Set<String> s=new LinkedHashSet<>();
	s.addAll(city);
	System.out.println(s);
	s.add("Dushanbe");
	
	// How to get only 1 value from Set
	
	if (s.contains("Beijing")) {
		System.out.println("We have Beijing");
	}
	
	// 1 way covert to list ( to get only 1 value )
	
	List<String> a=new ArrayList<>(s);
	String name=a.get(4);
	System.out.println(name);
	
	// 2 way 
	
	Object[] array=s.toArray();
	System.out.println(array[4]);
	
	// to sort 
 	
	
	
	
	

}
	
}
