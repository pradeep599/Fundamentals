package com.Arrays;

public class FrequentElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 3, 3, 1, 2, 3, 4, 5, 6, 1, 4, 2 };
		boolean[] isboolean = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (isboolean[i]) {
				continue;
			}
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					isboolean[j] = true;
				}
			}
			System.out.println(arr[i] + "->" + count);
		}
	}

}
