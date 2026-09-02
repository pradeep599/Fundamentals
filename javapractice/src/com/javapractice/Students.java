package com.javapractice;

public class Students {

	static String collegename="Vcube";
	int studentID;
	String studentname;
	int studentmarks;
	
	public static void main(String[] args) {
		Students PC=new Students();
		PC.studentID=1;
		PC.studentname="Pradeep Chandu";
		PC.studentmarks=100;
		System.out.println("StudentID:"+PC.studentID);
		System.out.println("Name:"+PC.studentname);
		System.out.println("Marks:"+PC.studentmarks);
		System.out.println("Name of College:"+collegename);
		System.out.println("***********************************");
		
		Students VL=new Students();
		VL.studentID=2;
		VL.studentname="Vasu";
		VL.studentmarks=100;
		System.out.println("StudentID:"+VL.studentID);
		System.out.println("Name:"+VL.studentname);
		System.out.println("Marks:"+VL.studentmarks);
		System.out.println("Name of College:"+collegename);
		System.out.println("***********************************");
		
		Students NS=new Students();
		NS.studentID=3;
		NS.studentname="Nikhil sai";
		NS.studentmarks=100;
		System.out.println("StudentID:"+NS.studentID);
		System.out.println("Name:"+NS.studentname);
		System.out.println("Marks:"+NS.studentmarks);
		System.out.println("Name of College:"+collegename);
		System.out.println("***********************************");
		
		Students RB=new Students();
		RB.studentID=4;
		RB.studentname="Ramesh";
		RB.studentmarks=100;
		System.out.println("StudentID:"+RB.studentID);
		System.out.println("Name:"+RB.studentname);
		System.out.println("Marks:"+RB.studentmarks);
		System.out.println("Name of College:"+collegename);
		System.out.println("***********************************");
		
		
		
		

	}

}
