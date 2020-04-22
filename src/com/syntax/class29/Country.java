package com.syntax.class29;

import java.util.*;

public class Country {
		
		public static void main(String[] args) {
			
			Set<String> city=new LinkedHashSet<>();
			
			city.add("DC");
			city.add("NewYork");
			city.add("Beijing");
			city.add("London");
			city.add("Dubai");
			city.add("Ashghabad");
			city.add("Beijing");
			city.add("Amsterdam");
			city.add("Rome");
			
			System.out.println(city);
			System.out.println("------------");
			
			
			
			
			
			
			for(String c:city) {
				System.out.println(c);
			}
			System.out.println("------------");
			
			
			
			
			
			
			Iterator<String> c=city.iterator();
			while(c.hasNext()) {			
				if (c.next().startsWith("A")) {
					c.remove();
				} 
							
			} System.out.println(city);
			System.out.println("------------");
			
			
			
			
			
			
			Set<Student> st=new HashSet<>();
			st.add(new Student("Jaga",123456l));
			
			Iterator<Student> it=st.iterator();
			while(it.hasNext()) {
			it.next().display();
			}
			
			
			
		}

	}


