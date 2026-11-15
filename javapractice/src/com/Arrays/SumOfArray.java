
package com.Arrays;

public class SumOfArray {

	public static void main(String[] args) {

		int numbers[] = { 10, 20, 30, 40, 50, 60 };
		int sum[] = new int[numbers.length];

		for (int i=0; i<numbers.length; i++) {

			if (i==0) {
				sum[i] = numbers[i] + numbers[i+1];
			} else if (i==numbers.length-1) {
				sum[i] = numbers[i] + numbers[i-1];
			} else {
				sum[i] = numbers[i-1] + numbers[i+1];

			}
		}

		for (int i=0; i<sum.length; i++) {
			System.out.print(sum[i] + " ");
		}
	}
}
