package com.syntax.class24;

public abstract class File {
	
	public abstract void open();		
	
	public void edit() {
		System.out.println("Edit in File");
	}
	public void close() {
		System.out.println("Close in File");
	}
}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("JavaFile needs to be open with notepad++ or sublime text");
		
	}

	
}


class WordFile extends File {

	@Override
	public void open() {
		System.out.println("To open WordFile we need to install Microsoft");
		
	}
	
   
}


class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("PDF needs to be converted to JPEG");
		
	}
	
 
	
}

