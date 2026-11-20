package com.POC;

import java.util.Scanner;

public class Loan {
	
	static Scanner sc=new Scanner(System.in);
	
//	double getROI() {
//		
//	}
	
	int getCibilScore(){
		System.out.println("Enter the cibil score:");
		int cibil=sc.nextInt();
		return cibil;
	}
	
	int getAge() {
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		return age;
	}

	double getCustomerSalary(){
		System.out.println("Enter the salary:");
		double salary=sc.nextDouble();
		return salary;
	}
	
	public static void main(String[] args) {
		
		System.out.println("****************WELCOME TO VCUBE BANK*****************");
		
		
		
		System.out.println();
	}

}
