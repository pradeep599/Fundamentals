package com.javapractice;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main method Started");
		System.out.println("Hi all Good mornig!! have a nice day");
		
		
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.javapractice.Student");
		Class.forName("com.javapractice.Welcome");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Main methid Ended");

	}

}
 