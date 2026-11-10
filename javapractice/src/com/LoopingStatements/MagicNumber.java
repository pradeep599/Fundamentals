package com.LoopingStatements;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		boolean flag=isMagic(n);
		
		if(flag) {
			System.out.println("Given Number is a Magic Number");
		}else {
			System.out.println("Given Number is Not a Magic Number");
		}
		sc.close();
	}

	static boolean isMagic(int n){
		int r=0;
		int sum=0;
		boolean status=false;
		
		while(n>9) {
			sum=0;
			 while(n>0) {
				 r=n%10;
				 n=n/10;
				 sum=sum+r;
			 }
			 n=sum;
		 }
		if(sum==1) {
			status=true;
		}
		return status;
	}
}
