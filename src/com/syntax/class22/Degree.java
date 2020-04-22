package com.syntax.class22;

public class Degree {
	
	public void getPrerequisite() {
		System.out.println("1-To get a degree you need a high school diploma");
	}

}

class Bachelors extends Degree{
	

	public void getPrerequisite() {
		System.out.println("2-To get a degree you need a high school diploma");
	}
}


class Masters extends Degree{
	

	public void getPrerequisite() {
		System.out.println("3-To get a degree you need a high school diploma");
	}

	
}
