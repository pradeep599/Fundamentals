package com.LoopingStatements;

import java.util.Scanner;

public class ReverseNumber {
	
	 static int reverseNumber(int n) {
		int r=0;
		int reverse=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			reverse=reverse*10+r;
		}

		 return reverse;
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rev=reverseNumber(n);
		System.out.println("The Reverse Number of Given Number is:"+rev);
		sc.close();
	}

}
