package com.LoopingStatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Which table do you want to print..?");
		int n=sc.nextInt();
		System.out.println("How many times do you want to print..?");
		int n1=sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			System.out.println(n+" X "+i+" = "+(n*i));
			
		}
	}

}
