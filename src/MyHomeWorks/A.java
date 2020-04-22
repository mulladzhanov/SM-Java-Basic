package MyHomeWorks;

public class A {
	

	public void m1() {
		System.out.println("a");
	}
	
	public void m2() {
		System.out.println("b");
	}
	

	public static void main(String[] args) {
		  
		  A obj=new B();
		  obj.m1();
		  obj.m2();
		
	} 
	
	
	
}
	
class B extends A{
	
	public void m1() {
		System.out.println("a1");
	}
	
	
	public void m3() {
		System.out.println("b1");
	}
	


	  }

