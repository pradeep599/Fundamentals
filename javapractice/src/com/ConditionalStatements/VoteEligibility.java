package com.ConditionalStatements;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {

		int age;
		boolean areYouIndian;
		boolean doYouHaveVoterID;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your age:");
		age = sc.nextInt();

		if (age > 18) {
			System.out.println("Good to go for Next Step");

			System.out.println("Are you Indian:");
			areYouIndian = sc.nextBoolean();
			if (areYouIndian) {
				System.out.println("Right to Vote");

				System.out.println("Do you have VoterID:");
				doYouHaveVoterID = sc.nextBoolean();
				if (doYouHaveVoterID) {
					System.out.println("Eligible to Vote");
				} else {
					System.out.println("Voter ID required");
				}

			} else {
				System.out.println("You are not Right to Vote ");
			}

		} else {

			System.out.println("Not Eligible to Vote !!");
		}
	}

}
