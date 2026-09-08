package com.javafundamentals;

public class Student {
	static String college="Vcube";
	String name;
	int age;
	
	void display() {
		System.out.println("StdName:"+name);
		System.out.println("Age:"+age);
		System.out.println("CollegeName:"+college);
		System.out.println("**************************");
		
	}

	public static void main(String[] args) {
		System.out.println("STUDENT DETAILS");
		System.out.println("**************************");
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();	
		
		s1.name="Pradeep chandu";
		s1.age=22;
		s1.display();
		
		s2.name="Vasu";
		s2.age=22;
		s2.display();
		
		s3.name="Revanth";
		s3.age=22;
		s3.display();
		
	
	}

}
