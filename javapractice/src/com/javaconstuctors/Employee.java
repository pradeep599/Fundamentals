package com.javaconstuctors;

public class Employee {
	
	int id;
	String name;
	double sal;
	
	void empInfo() {
		System.out.println("Employee ID:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Salary:"+sal);
	}
	
	
	Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}


	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"Pradeep",100000);
		e1.empInfo();

	}

}
