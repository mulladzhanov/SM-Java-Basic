package com.syntax.class20;

public class Employee {
	
	static String company;
	int empNumber;
	double salary;
	
	void getPaid() {
		System.out.println("Employee gets paid "+salary);
	}
	static void work() {
		System.out.println("Employee works at "+company);
	}
	
}
	class Scrum extends Employee{
		
		  public void attendMeeting() {
			System.out.println("Scrum team attends ceremonies in "+company);
			
		}
	}
		class PO extends Scrum {
			public void prioritizeBacklog() {
				System.out.println("Prioritizes the Backlog");
				
			}
		}
		class SM extends Scrum {
			public void navigateTeam() {
				
			}
		}
		class Dev extends Scrum {
			public void coding() {
				
			}
		}
		class Tester extends Scrum {
			public void test() {
				
				System.out.println("Testing all codes");
				
			}
		}
		class BA extends Scrum {
			public void workWithRequirements() {
				
			}
		}
		
		
	


