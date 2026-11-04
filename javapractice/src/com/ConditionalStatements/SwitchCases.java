package com.ConditionalStatements;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Jersey Number");
		int jno=sc.nextInt();
		
		switch(jno) {
		case 7->{
		System.out.println("MSD:Mahindra Sigh Dhoni");
		System.out.println("Captain Cool & Great Wiket Keeper");
		}
		case 18->System.out.println("VK:Virat Kohli");
		case 45->System.out.println("RS:Rohit Sharma");
		case 999->System.out.println("CG:Chris Gayle");
		default->System.out.println("Entered Jersey Number is Invalid !!");
		}
	}

}
