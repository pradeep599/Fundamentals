package com.LoopingStatements;

import java.util.Scanner;

public class SumofItsDigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int sum=sumofItsDigit(n);
		System.out.println("Sum of Its Digit is:"+sum);
		sc.close();
	}

	 static int sumofItsDigit(int n) {
		 int r=0;
		 int sum=0;
		 
		 while(n>0) {
			 r=n%10;
			 n=n/10;
			 sum=sum+r;
		 }
		 
		return sum;
	}

}
