package com.syntax.class21;

public class TestTeacherClass {

	public static void main(String[] args) {
		

		MathTeacher mt=new MathTeacher("Brian","Quisbert");
		System.out.println(mt.name);
		
		JavaTeacher jt=new JavaTeacher("Jaga","Isakov","QA tester");
		System.out.println(jt.name+" "+jt.lastName+" has a certification of "+jt.certification);
		
		
	}

}
