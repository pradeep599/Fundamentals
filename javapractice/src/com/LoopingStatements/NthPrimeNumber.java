package com.LoopingStatements;

import java.util.Scanner;

public class NthPrimeNumber {

	static boolean isprime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth value:");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 0; i < 100; i++) {
			if (isprime(i)) {
				count++;
				if (count == n) {
					System.out.println(i + "-" + count);
				} 
			}

		}
		sc.close();
	}

}
