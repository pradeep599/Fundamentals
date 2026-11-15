package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrint {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		int []numbers=new int[size];
		
		System.out.println("Enter the elememts:");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		if(numbers[size] %2==0) {
			System.out.println(numbers);	
		}
		
	}

}
