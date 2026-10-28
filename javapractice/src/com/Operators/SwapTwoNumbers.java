package com.Operators;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;

//		System.out.println("Before Swap");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("*****************");
//
//		temp = a;
//		a = b;
//		b = temp;
//
//		System.out.println("After Swap");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("*****************");
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
	
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
