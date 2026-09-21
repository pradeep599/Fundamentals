package com.javafundamentals;

public class DataTypesEmployee {
	static int AvailableLeaves=5;
	void remaining(){
		RemainingLeaves=AvailableLeaves--;
	}
	int RemainingLeaves;
	short empID;
	byte age;
	double salary;
	char grade;
	int YOE;
	boolean Isactive;
	long phone;
	
	void display() {
		System.out.println("EmployeeID:"+empID);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Grade:"+grade);
		System.out.println("Experience:"+YOE);
		System.out.println("IsActive:"+Isactive);
		System.out.println("AvailableLeaves:"+AvailableLeaves);
		System.out.println("Remaining Leaves:"+RemainingLeaves);
		System.out.println("Phone:"+phone);
		System.out.println("*****************************");

	}

	public static void main(String[] args) {
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("*****************************");
		
		DataTypesEmployee e1=new DataTypesEmployee();
		DataTypesEmployee e2=new DataTypesEmployee();
		DataTypesEmployee e3=new DataTypesEmployee();
		
		e1.empID=100;
		e1.age=32;
		e1.salary=50000.50;
		e1.grade='A';
		e1.YOE=3;
		e1.Isactive=true;
		e1.phone=8329745267L;
		e1.display();
		e1.remaining();
		
		
		e2.empID=101;
		e2.age=42;
		e2.salary=60000;
		e2.grade='B';
		e2.YOE=5;
		e2.Isactive=false;
		e2.phone=9023573754L;
		e2.display();
		e2.remaining();
		
		e3.empID=102;
		e3.age=30;
		e3.salary=40000.55;
		e3.grade='A';
		e3.YOE=10;
		e3.Isactive=true;
		e3.phone=9856375637L;
		e3.display();
		
		
	}

}
