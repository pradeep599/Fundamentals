package com.javafundamentals;

public class BankAccount {
	
	static int accountnumbergenerator=1000;
	int accountnumber;
	String accountHolderName;
	int balance;
	
	{
		accountnumber=accountnumbergenerator++;
	}
	

	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount();
		b1.accountHolderName="Pradeep";
		b1.balance=50000000;
		System.out.println("Account Nmuber:"+b1.accountnumber);
		System.out.println("AccountHolderName:"+b1.accountHolderName);
		System.out.println("Balance:"+b1.balance);
		
		BankAccount b2=new BankAccount();
		b2.accountHolderName="Vasu Laxman";
		b2.balance=30000000;
		System.out.println("Account Number:"+b2.accountnumber);
		System.out.println("AccountHolderName:"+b2.accountHolderName);
		System.out.println("Balance:"+b2.balance);
		
		
		
		
	}

}
