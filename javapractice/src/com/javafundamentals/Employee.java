package com.javafundamentals;

public class Employee {
	
	static String company="Vcube";
	static int trainerID=101;
	int TrainerID;
	String name;
	int salary;
	
	void EmployeeDetails() {
		System.out.println("TrainerID:"+TrainerID);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("**************************");
	}
	
	{
		TrainerID=trainerID++;
	}

	public static void main(String[] args) {
		
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("**************************");
		
		Employee e1 =new Employee();
		Employee e2 =new Employee();
		
		e1.name="Srikanth";
		e1.salary=50000;
		e1.EmployeeDetails();
		
		e2.name="Vishwanath";
		e2.salary=50000;
		e2.EmployeeDetails();
		
		
		
	}

}
