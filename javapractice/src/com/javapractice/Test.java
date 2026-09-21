package com.javapractice;

public class Test {
	static {
		
		System.out.println("Static in class");
	}

	public static void main(String[] args) {
		
		System.out.println("Main called");
		
	
	}
	static {
		System.out.println("static in main");
	}

}
