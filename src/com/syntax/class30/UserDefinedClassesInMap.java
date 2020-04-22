package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {
	
	String name, type;
	
	public Store(String type, String name) {
		this.name=name;
		this.type=type;
				
	}
	public void display() {
		System.out.println("This store "+name);
	}
	public abstract void workingHours();
	
}

class Nike extends Store {
	
	public Nike(String type,String name) {
		super(type,name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works from 10am till 6pm");		
	}
	
		
}

class Costco extends Store {
	
	
	public Costco (String type, String name) {
		super(type,name);
		
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works from 8 am until 8pm");
		
	}
}
class Amazon extends Store {
	
	
	public Amazon (String type, String name) {
		super(type,name);
		
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works 27/7");
		
	}
}


public class UserDefinedClassesInMap {
	
	public static void main(String[] args) {
		// we want to store stores in form 1= amazon --> costco --> nike 
		
		Map<Integer, Store> storeMap=new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online", "Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));
		
		System.out.println(storeMap);
		
		// to get an access to all methods of our Store Objects: .values(); .keySet(); .entrySet();
		
		//1 way - .values();
		
		Collection<Store> col=storeMap.values();
		
		for(Store store:col) {
			store.workingHours();
			store.display();
			System.out.println("---------------------");
			
		}
		System.out.println("-----------**----------");
		
		//2 way - get all Entry Objects --> getValue
		
		Set<Entry<Integer, Store>> storeSet=storeMap.entrySet();
		for(Entry<Integer,Store> entry :storeSet) {
			entry.getValue().workingHours();
			entry.getValue().display();
			System.out.println("-----------**----------");
		}
		
		System.out.println("-----------##----------");
		
		// 3 way - get all Keys --> get value specified key
		
		Set<Integer> keys=storeMap.keySet();
		for(Integer key:keys) {
			Store obj=storeMap.get(key);
			obj.workingHours();
			obj.display();
			
			System.out.println("-----------##----------");
		}
		
		
		
	}

}
