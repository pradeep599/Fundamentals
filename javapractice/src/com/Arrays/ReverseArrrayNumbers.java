package com.Arrays;

public class ReverseArrrayNumbers {

	public static void main(String[] args) {

		int [] arr= {11,12,13,14,15,16};
		
		for(int i=0;i<arr.length;i++) {
			  int n=arr[i];
			int rev=0;
			int r=0;
			
			while(n>0) {
				r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			arr[i]=rev;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
