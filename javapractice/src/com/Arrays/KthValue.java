package com.Arrays;

import java.util.Scanner;

public class KthValue {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 7, 9, 11,13 };
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the K value :");
		int k=sc.nextInt();
		int largest=Integer.MAX_VALUE;
		
		for(int i=1;i<=k;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>max && arr[j]<largest) {
					max=arr[j];
				}
			}
			largest=max;
		}
		System.out.println(largest);
		
	}
}
