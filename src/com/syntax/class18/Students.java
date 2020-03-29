package com.syntax.class18;

public class Students {
	
	String sname;
	int a,b,c;		
	
	Students(String name,int a1,int b1, int c1) {
		
		sname=name;
		a=a1;
		b=b1;
		c=c1;
		
	}
	
    int m1() {
		
		int aver=(a+b+c)/3;	
			
		 
		 return aver;
		
	}
		
		
	
	
	 public static void main(String[] args) {
		 
		 Students obj=new Students("Jaga",50,40,30);
		 System.out.println("Student "+obj.sname+" has a average of "+obj.m1()+" grade"); 
	}

}
