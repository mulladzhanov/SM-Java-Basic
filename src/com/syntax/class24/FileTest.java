package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		
		File obj=new JavaFile();
		obj.close();
		obj.edit();
		obj.open();
		
		System.out.println("-----------------");
		
		
		File obj1=new WordFile();
		obj1.close();
		obj1.edit();
		obj1.open();
		
		System.out.println("-----------------");
		
		File obj2=new PDFFile();
		obj2.close();
		obj2.edit();
		obj2.open();
	
		

	}

}
