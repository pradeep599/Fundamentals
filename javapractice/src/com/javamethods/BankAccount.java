package com.javamethods;

public class BankAccount {
	
	static int balance=1000;
	
	static void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Credited Amount:"+balance);
	}
	
	static void withdraw(int amount) {
		balance=balance-amount;
		System.out.println("Reamaining Amount:"+balance);
	}

	public static void main(String[] args) {
		
		System.out.println("Balance:"+balance);
		deposit(500);
		withdraw(200);
		
	}

}
