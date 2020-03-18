package com.syntax.class12;

public class MoreStringFunction {
	
	
	public static void main(String[] args) {
		
		String me="I am a good tester";
		
		System.out.println("========replace() FUNCTION=========");
		
		
		String newString=me.replace("a", "c");
				
			System.out.println(newString);
			
			me=me.replace("good", "great");
			
			System.out.println(me);
			
			System.out.println("========replaceAll() FUNCTION=========");
		
			String str="Phone number is 1234567890";
			
			str=str.replaceAll("[A-Za-z]","").trim();
			
			System.out.println(str);
			
			
			String str1="Hello1234567**&&**  !!90";
			
			str1=str1.replaceAll("[0-9]","");
			System.out.println(str1);
			
			str1=str1.replaceAll("[^A-Za-z]", "");
			System.out.println(str1);
		
			
			String str2="Hello123^&^&^&^&*!";
			str2=str2.replaceAll("[^A-Za-z0-9]", "");
			
			System.out.println(str2);
			
			
			String subject="Java";
			
			subject=subject.replace("a", "e").replace("J","I").toUpperCase();
			System.out.println(subject);
			
			System.out.println(subject.replaceFirst("E", "g"));
			
			
			
			
			
	}

}
