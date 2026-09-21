package com.javafundamentals;

public class Method {

	static void addition(int a, int b) {
		System.out.println("Addition:" + (a + b));

	}

	static void subtraction(int a, int b) {
		System.out.println("Subtraction:" + (a - b));

	}

	static void multiply(int a, int b) {
		System.out.println("Multiplication:" + (a * b));
	}

	static void division(int a, int b) {
		System.out.println("Division:" + (a / b));
	}

	static void modulus(int a, int b) {
		System.out.println("Modulus:" + (a % b));
	}

	static void square(int a, int b) {
		System.out.println("Square:" + (a * a));
		System.out.println("Square:" + (b * b));
		System.out.println("Sum:" + (a * a + b * b));
	}

	static void cube(int a) {
		System.out.println("Cube:" + (a * a * a));
	}

	static void AreaOfCircle(double r) {
		double area = Math.PI * r * r;
		System.out.println("Area Of a Circle:" + area);

	}

	static void areaofrectangle(int length, int breadth, int hight) {
		int area = length * breadth * hight;
		System.out.println("Area Of a Rectangle:" + area);
	}
	
	void areaofsquare(int s) {
		int result=s*s;
		System.out.println("Area Of a Sqquare:"+result);
	}

	public static void main(String[] args) {

		Method.addition(2, 6);
		Method.subtraction(4, 6);
		Method.multiply(34, 343);
		Method.division(89, 4);
		Method.modulus(99, 2);
		square(5, 56);
		cube(567);
		AreaOfCircle(5.3);
		areaofrectangle(3, 5, 6);
		
		Method AOS=new Method();
		AOS.areaofsquare(8);
		

	}

}
