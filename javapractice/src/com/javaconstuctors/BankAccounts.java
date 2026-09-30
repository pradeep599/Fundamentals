package com.javaconstuctors;

public class BankAccounts {
	long accountNumber;
	String accountHolderName;
	double balance;
	String branch;

	BankAccounts(long accountNumber, String accountHolderName, double balance, String branch) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		this.branch=branch;

	}
	
	BankAccounts(BankAccounts b1,double bal,String br){
		this.accountNumber=b1.accountNumber;
		this.accountHolderName=b1.accountHolderName;
		this.balance=bal;
		this.branch=br;
		
	}
	
	BankAccounts(BankAccounts b2,String nm, long accno){
		this.accountNumber=accno;
		this.accountHolderName=nm;
		this.balance=b2.balance;
		this.branch=b2.branch;
		
	}

	
	void displayAccountdetails() {
		System.out.println("*****************************************");
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Account Holder Name:"+accountHolderName);
		System.out.println("Account Balance:"+balance);
		System.out.println("Account Branch:"+branch);
	}
	public static void main(String[] args) {
		System.out.println("-----------WELCOME TO VCUBE BANK------------");

		BankAccounts b1=new BankAccounts(34665779494L,"Pradeep",2054340.56,"Kodad");
		b1.displayAccountdetails();
		
		BankAccounts b2=new BankAccounts(b1,3637474.865,"Hyderabad");
		b2.displayAccountdetails();
		
		BankAccounts b3=new BankAccounts(b2,"Ramesh",45365376833L);
		b3.displayAccountdetails();
	}

}
