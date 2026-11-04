package com.LoopingStatements;

import java.util.Scanner;

public class IsPrimeOrNot {
	
	static boolean isprime(int n) {
		boolean status=true;
		
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		
		return status;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check Prime or Not..?");
		int i=sc.nextInt();
		
		boolean isprime=isprime(i);
		if(isprime) {
			System.out.println("Given number is a Prime ");
		}else {
			System.out.println("Given nuber is Not a Prime");
		}
		sc.close();
	}

}
