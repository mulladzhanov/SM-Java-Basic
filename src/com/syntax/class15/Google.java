package com.syntax.class15;

public class Google {

	
		

		// define features such as emp id,name,last name,salary
		// define a behavior working, get paid,attending meetings
		
		
		int empId;
		
		double salary;
		String name, lastName, title;
		
		void working() { //method header
			System.out.println(title+" is working"); //method body
		}
		
		void getPaid() { 
			System.out.println(name+" is getting paid "+salary);
		}
		
		void attendMeetings() {
			System.out.println(name+" is attending meetings");
		}
		
        public static void main(String[] args) {
        	
        	Google emp1=new Google();
        	emp1.empId=123;
        	emp1.name="John";
        	emp1.lastName="Smith";
        	emp1.title="CEO";
        	emp1.salary=200000;
        	
        	emp1.working();
        	emp1.getPaid();
        	emp1.attendMeetings();
        	
        	Google emp2=new Google();
        	emp2.empId=321;
        	emp2.name="Seyma";
        	emp2.lastName="Atasoy";
        	emp2.title="QA Engineer";
        	emp2.salary=100000;
        	emp2.working();
        	emp2.getPaid();
        	emp2.attendMeetings();
        	
	
}
	

}
