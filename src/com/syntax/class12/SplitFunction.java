package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		
         System.out.println("======split() FUNCTION=========");

         String today="Today is my favorite Java class";
         
         String[] array=today.split("my");
         System.out.println(array.length);
         System.out.println(array[0]);
         System.out.println(array[1]);
         
         String today1="Today is my favorite Java class";
         
         String[] stringArray=today1.split("a");
         
         for (String a:stringArray) {
        	 System.out.print(a+"|");
        	 
         } 
        	 String today2="Today is my favorite Java class";
        	 
        	 String[] words=today2.split(" ");
        	 
        	 for (int i=0; i<words.length; i++) {
        		 System.out.print(words[i]+" ");
        		 
        	 } 
        	 
        	 
        	 
        	 
        	 
        	 
         }
         
	}


