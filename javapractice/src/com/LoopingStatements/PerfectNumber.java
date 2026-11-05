package com.LoopingStatements;

import java.util.Scanner;

public class PerfectNumber {
	
	static boolean perfectNumber(int n) {
		boolean status=false;
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
			if(sum==n) {
				return true;
			}
		
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();

		boolean flag=perfectNumber(n);
		if(flag) {
			System.out.println("Given Number is a Perfect Number");
		}else {
			System.out.println("Given Number is Not a Perfect Number");
		}
		sc.close();
	}

}
