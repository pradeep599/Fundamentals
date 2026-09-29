package com.javaconstuctors;

public class BankAccount {

	long accountNumber;
	String customerName;
	String accountType;
	double balance;

	BankAccount(long accountNumber, String customerName, String accountType, double balance) {

		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;

	}
	
	void bankAccountInfo() {
		System.out.println("************************************");
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Account Type:"+accountType);
		System.out.println("balance:"+balance);	
	}

	public static void main(String[] args) {
		System.out.println("BANK ACCOUNT DETAILS");

		BankAccount b1 = new BankAccount(34728465383L, "Pradeep", "savings", 1000000.89);
		b1.bankAccountInfo();
		
		BankAccount b2 = new BankAccount(44628749747L, "Vasu", "current", 100000000.89);
		b2.bankAccountInfo();

	}

}
