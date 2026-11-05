package com.LoopingStatements;

import java.util.Scanner;

public class Panlindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		boolean flag=palindrome(n);
		System.out.println("");
		
		if(flag) {
			System.out.println("Given Number is Palindrome");
		}else {
			System.out.println("Given Number is Not a Palindrome");
		}
		sc.close();
	}

	static boolean palindrome(int n) {
		boolean status=false;
		int r=0;
		int reverse=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			reverse=reverse*10+r;
		}
		if(reverse==n) {
			status=true;
		}
		return status;
	}

}
