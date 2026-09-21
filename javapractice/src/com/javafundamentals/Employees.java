package com.javafundamentals;

public class Employees {

	int empID;
	String Empname;
	int salary;
	
	void EmployeeDetails() {
		System.out.println("EmpID:"+empID);
		System.out.println("EmpName:"+Empname);
		System.out.println("Salary:"+salary);
		System.out.println("*************************");
	}
	
	public static void main(String[] args) {
		System.out.println("EMPLOYEES DETAILS");
		System.out.println("*************************");
		
		Employees E1=new Employees();
		Employees E2=new Employees();
		Employees E3=new Employees();
		
		E1.empID=101;
		E1.Empname="Srikanth";
		E1.salary=50000;
		E1.EmployeeDetails();
		
		E2.empID=102;
		E2.Empname="Vishwanath";
		E2.salary=45000;
		E2.EmployeeDetails();
		
		E3.empID=103;
		E3.Empname="Pradeep";
		E3.salary=60000;
		E3.EmployeeDetails();

		
	}

}
