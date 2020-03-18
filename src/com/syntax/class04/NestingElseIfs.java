package com.syntax.class04;

public class NestingElseIfs {
	
	public static void main(String[] args) {
		
		/* if student complited a quiz we will check for a score
		 * if score >90 --> great job
		 * if score >80 --> well done
		 * if score >70 --> you could have done better
		 * 
		 * if student did not completed the quiz --> not good
		 * please do homework on time
		 */
	boolean quizComplited=true;
	int score=91;
	
	if (quizComplited) {
		System.out.println("Let's check your score");
		
		if (score>90) {
			System.out.println("Great job!");
		} else if (score>80) {
			System.out.println("Well done!");
		}else if (score>70) {
			System.out.println("You could have done better!");
		} else {
			System.out.println("You are failed");
		}
	} else {
		System.out.println("Please do your HW on time");
	}
	   
	
	
	}

}
