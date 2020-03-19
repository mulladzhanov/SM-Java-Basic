package com.syntax.class13;

public class InterviewQ1 {

	public static void main(String[] args) {
		
		
		int a=10; // Write program to swap values of a and b without temporary variable
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("======== 2 ===========");
		
		
		String str1="Day";
		String str2="Night";
		
		// str1=str1+str2; //DayNight
		// str2=str1.substring(0 , 3); //Day
		// str1=str1.substring(3); //Night
		
		// 2nd way
		
		str1=str1+str2; // DayNight
		str2=str1.substring(0, str1.length()-str2.length()); //Day
		str1=str1.substring(str2.length()); //Night
		
		System.out.println(str1);
		System.out.println(str2);   
		
		
		// 3rd way
		
		String s1="Hello";
		String s2="Bye";
		
		String shorterStr1=s1+s2;
		
		s1=shorterStr1.replace(s1,""); //Bye
		s2=shorterStr1.replace(s2,""); //Hello
		
		System.out.println(s1);
		System.out.println(s2);
   		
		
		
	}

}
