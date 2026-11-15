package com.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 7, 5, 8, 26, 25, 13 };

		int largest = 0;
		int secondlargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondlargest && arr[i] != largest) {
				secondlargest = arr[i];
			}
		}
		System.out.println("Second Largest:"+secondlargest);
	}

}
