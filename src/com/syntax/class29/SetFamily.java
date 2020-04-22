package com.syntax.class29;


import java.util.*;

public class SetFamily {
	
	public static void main(String[] args) {
		
		// HashSet
		
		Set<String> veggies= new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		
		System.out.println(veggies);
		
		// LinkedHashSet
		
		Set<String> fruits= new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("pineapple");
		
		System.out.println(fruits);
		
		// TreeSet
		
		Set<String> food=new TreeSet<>(veggies);
		food.addAll(fruits);
		System.out.println(food);
		
		
		
		
		
	}

}
