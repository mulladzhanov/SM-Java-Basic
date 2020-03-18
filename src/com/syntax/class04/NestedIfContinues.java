package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		// Check if patient has any allergies
		// If no allergies --> you are healthy
		// otherwise check if patient has:
		// -orange allergy --do not eat orange
		// -apple allergy --do not eat apple
		// -kiwi allergy --do not eat kiwi

		boolean isAllergic = true;
		boolean appleAllergy = false;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = false;

		if (isAllergic) {
			System.out.println("Please answer below");
             
			if (appleAllergy) {
				System.out.println("Do not eat Apples");
			} if (orangeAllergy) {
				System.out.println("Do not eat Oranges");				
			} if (kiwiAllergy) {
				System.out.println("Do not eat Kiwi");
			}
		} else {
			System.out.println("You are healthy");

		}

	}

}
