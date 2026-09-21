package com.javamethods;

import java.util.Scanner;

public class BankAccounts {

	double balance = 100000.00;
	Scanner sc = new Scanner(System.in);

	double withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient Balance");
		}

		return balance;

	}

	double deposite(double amount) {
		if (amount >= 100) {
			balance = balance + amount;
		} else {
			System.out.println("Check Your Entered Amount");
		}
		return balance;
	}

	double checkBalance() {
		System.out.println("Thank You Visit Again!!");
		return balance;
	}

	void main() {

		
		System.out.println("$$$$WELCOME TO PRADEEP NATIONAL BANK$$$$");
		System.out.println("*************************************");

//		Depoiste code from here
		System.out.println("Enter your Deposite Amount:");
		double dp = sc.nextDouble();
		balance = deposite(dp);
		System.out.println("After Deposite Your Balance:" + balance);
		System.out.println("*************************************");


//		Withdraw code from here

		System.out.println("Enter your Withdraw Amount:");
		double wd = sc.nextDouble();
		balance = withdraw(wd);
		System.out.println("After Withdraw Your Balance:" + balance);
		System.out.println("*************************************");


//		Check Balance code from here
		checkBalance();

	}

}
