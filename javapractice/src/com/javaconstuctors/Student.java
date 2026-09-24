package com.javaconstuctors;

public class Student {

	int sid;
	String name;

	Student() {
		System.out.println("Student Constuctor called");
		sid = 1001;
		name = "Unknown";
	}

	Student(int sid, String sname) {

	}

	void studentInfo() {
		System.out.println("***************************");
		System.out.println("Student ID:" + sid);
		System.out.println("Student Name:" + name);

	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.sid = 01;
		s1.name = "Pradeep";
		s1.studentInfo();

		Student s2 = new Student(9, "Chandu");
		s2.studentInfo();

		Student s3 = new Student();
		s3.studentInfo();
	}

}
