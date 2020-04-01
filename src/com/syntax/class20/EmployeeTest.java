package com.syntax.class20;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		
		Employee obj=new Employee();
		Employee.company="Google";
		obj.salary=32.000;
		obj.getPaid();
		
		Scrum obj3=new Scrum();
		obj3.attendMeeting();
		
		
		
		SM obj1=new SM();
		obj1.navigateTeam();
		
		
		Tester obj2=new Tester();
		obj2.test();
		
		
		
		
		
	}

}
