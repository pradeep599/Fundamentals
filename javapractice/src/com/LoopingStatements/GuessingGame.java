package com.LoopingStatements;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Random rs = new Random();
		int guess = rs.nextInt(11);
		String yn = "";
		Scanner sc = new Scanner(System.in);

		do {

			for (int i = 1; i <= 3; i++) {
				System.out.println("Guess the random Number:");
				int n = sc.nextInt();
				if (n < guess) {
					System.out.println("Too Low!Try Again.");
				} else if (n > guess) {
					System.out.println("Too high!Try Again.");
				} else if (n == guess) {
					System.out.println("Congratulations!! You Guessed the Correct Number");
					break;
				}

			}
			System.out.println("Game Over!!");
			System.out.println("The Correct Number is:" + guess);
			System.out.println("Do you Want to Start a New Game..?Click Y for Start N for Stop");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Thank you!! Visit Agin");
		sc.close();
	}

}
