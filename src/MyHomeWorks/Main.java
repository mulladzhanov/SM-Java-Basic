package MyHomeWorks;
class Main {
	  
	  String method(String a, char b) {
		  
		  String c=Character.toString(b);
	    
	    String censorLetter=a.replaceAll(c,"*");
	    
	   
	    System.out.print(censorLetter);
	    
	    return censorLetter;
	  }
		
		public static void main(String[] args) {
		  
		 Main obj=new Main();
		 obj.method("computer science",'e');
		  
		}
	}
