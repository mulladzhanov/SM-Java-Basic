package com.syntax.class17;

public class AccessingToEmployee {

	public static void main(String[] args) {
		

		Employee emp= new Employee();
		Employee.title="QA Engineer";
		emp.name="John";
		emp.lastName="Smith";
		emp.salary=90000;
		//emp.ssn= 191911222; //CE : ssn is a private method
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4(); //CE : ssn is a private method
		
		

	}

}
