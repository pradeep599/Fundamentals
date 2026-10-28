package com.ConditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks Percentage:");
		double marks=sc.nextDouble();
		
		if(marks<0 || marks>100) {
			System.out.println("OOPs!! Invalid Marks");
		}else if(marks>=90) {
			System.out.println("Grade A");
		}else if(marks>=80) {
			System.out.println("Grade B");
		}else if(marks>=70) {
			System.out.println("Grade C");
		}else if(marks>=60) {
			System.out.println("Grade D");
		}else if(marks>=35) {
			System.out.println("Just Passed");
		}else {
			System.out.println("Failed !! See You In Again");
		}
		sc.close();
		
	}

}
