package com.LoopingStatements;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		
		boolean flag=isNeonNumber(n);
		
		if(flag) {
			System.out.println("Given number is Neon Number");
		}else {
			System.out.println("Given number is Not Neon Number");
		}
		sc.close();
	}

	static boolean isNeonNumber(int n){
		boolean status=false;
		int r=0;
		int prod=n*n;
		int sum=0;
		
			 while(prod>0) {
				 r=prod%10;
				 sum=sum+r;
				 prod=prod/10;
			 }
			
		if(sum==n) {
			status=true;
		}
		
		
		return status;
	}
}
