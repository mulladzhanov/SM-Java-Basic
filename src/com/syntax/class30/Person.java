package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Person {
	
	        //Create a Person class with following private fields: name, lastName, age, salary. 
			//Variables should be initialized through constructor.
			//Inside the class also create a method to print user details.
			//In Test Class create a Map that will store key in ascending order. 
			//In that map store personId and a Person Object. Print each object details.

	
		private String name, lastName;
		private int age;
		private double salary;
		
		Person(String name, String lastName, int age, double salary){
			this.name=name;
			this.lastName=lastName;
			this.age=age;
			this.salary=salary;
			
		}
		
		public void details () {
			System.out.println(name+" "+lastName+" is "+age+" years old and his salary is "+salary);
		}
		
public static void main(String[] args) {
	
	   Map<Integer ,Person> person=new TreeMap<>();
	   person.put(1, new Person("Jaga","Muminzoda",24,500.0));
	   person.put(3, new Person("Maxi","Isokov",26,2000.0));
	   person.put(5, new Person("Franky","Sabzov",29,100000.0));
	   person.put(2, new Person("Maximiliano","Gomez",28,10.0));
	   person.put(4, new Person("Shakl","Ziyodaliev",30,15000.0));
	   
	   for (Integer p:person.keySet()) {
		  //person.get(p).details();
	   }
	   
	   System.out.println("-----------------------------------------------------");
	   
	   for(Person p:person.values()) {
		  // p.details();
	   }
	   
	   System.out.println("-----------------------------------------------------");
	   
	   Set<Entry<Integer, Person>> per=person.entrySet();
	   for(Entry<Integer, Person> p: per ) {
		  // p.getValue().details();
	   }
	   
	   System.out.println("-----------------------------------------------------");
	   
	   // ITERATOR
	   
	   Iterator<Integer> it=person.keySet().iterator();
	   while(it.hasNext()) {
		person.get(it.next()).details();
		 
	   }
	   System.out.println("-----------------------------------------------------");
	   
	   Iterator<Person> itv=person.values().iterator();
	   while(itv.hasNext()) {
		   itv.next().details();
	   }
	   
	   System.out.println("-----------------------------------------------------");
	   
	   Iterator<Entry<Integer,Person>> ite=person.entrySet().iterator();
	   while (ite.hasNext()) {
		   Entry<Integer,Person> entry=ite.next();
		   person.get(entry.getKey()).details();
		   		   System.out.println("-----------------------------------------------------");
		   entry.getValue().details();
	   }
	   
		   
	  
		   
	   



}
	


}
     


       


		
		

		
		
		

	


