package com.LoopingStatements;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isprime(int n) {
		boolean status=true;
		
		if(n==0||n==1) {
			return false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many values you want to print ..?");
		int n =sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
			
		}
		sc.close();
	}

}
