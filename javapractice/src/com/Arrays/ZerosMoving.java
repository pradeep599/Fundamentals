package com.Arrays;

import java.util.Arrays;

public class ZerosMoving {

	public static void main(String[] args) {

		int[] array = { 1, 2, 0, 3, 0, 7, 0, 5, 4, 0, 0, 7 };

		int swap=array.length-1;
		for (int i = array.length-1; i >=0; i--) {
			System.out.print(array[i]+" ");
			if(array[i]!=0) {
				int temp=array[i];
				array[i]=array[swap];
				array[swap]=temp;
				swap--;
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
