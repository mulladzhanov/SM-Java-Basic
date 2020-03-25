package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		

		//access static members of another class
		
		RecapStaticKeyword.brand="Android";
		RecapStaticKeyword.touchscreen=true;
		RecapStaticKeyword.displayGeneralInfo();
		
		//access instance members of another class
		
		RecapStaticKeyword sk=new RecapStaticKeyword();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecifications();
		
		RecapStaticKeyword sk1=new RecapStaticKeyword();
		sk1.color="red";
		sk1.memory=128;
		
		
		RecapStaticKeyword sk2=new RecapStaticKeyword();
		sk2.color="red";
		sk2.memory=128;
		sk2.brand="Nokia"; // brand will change for all ins
		
		// not the right way access 
		
		sk.displayGeneralInfo();
		sk1.displayGeneralInfo();
		sk2.displayGeneralInfo();
		

	}

}
