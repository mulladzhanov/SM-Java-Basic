package com.syntax.class25;

interface Trustable{
	
	void trust();
	
}

public interface Bank extends Trustable {
	
	void depositMoney();
	
	void withdraw();

}



class PNC extends Finance implements Bank {

	@Override
	public void depositMoney() {
		System.out.println();
		
	}

	@Override
	public void withdraw() {
		System.out.println();
		
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		
	}

}

class BOA extends Finance implements Bank, CreditUnion {

	@Override
	public void depositMoney() {
		System.out.println();
		
	}

	@Override
	public void withdraw() {
		System.out.println();
		
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void giveCredit() {
		// TODO Auto-generated method stub
		
	}
	
}

class Finance {
	
	void financialTransaction() {
		System.out.println("Financial department deals with transactions");
	}
	
}
interface CreditUnion {
	
	void giveCredit();
	
}
