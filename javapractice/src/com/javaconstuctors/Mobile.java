package com.javaconstuctors;

import java.util.Scanner;

public class Mobile {
	

	String mobile_Brand;
	String mobile_model;
	double price;
	int year;
	String color;
	int quantity;
	int deliveryCharge;
	double totalCost;
	double cost;
	

	Mobile() {
		this("Unkonwn");

	}

	Mobile(String mobile_Brand) {
		this(mobile_Brand, "Unknown");

	}

	Mobile(String mobile_Brand, String mobile_model) {
		this(mobile_Brand, mobile_model, 100000.00);

	}

	Mobile(String mobile_Brand, String mobile_model, double price) {
		this(mobile_Brand, mobile_model, price, 2020);

	}

	Mobile(String mobile_Brand, String mobile_model, double price, int year) {
		this(mobile_Brand, mobile_model, price, year, "Unknown",200);

	}

	Mobile(String mobile_Brand, String mobile_model, double price, int year, String color, int deliveryCharge) {
		this.mobile_Brand = mobile_Brand;
		this.mobile_model = mobile_model;
		this.price = price;
		this.color = color;
		this.year = year;
		this.deliveryCharge=deliveryCharge;

	}

	void mobileInfo() {
		
		System.out.println("Mobile Brand:" +mobile_Brand);
		System.out.println("Mobile Model:" + mobile_model);
		System.out.println("Price:" + price);
		System.out.println("Color:"+color);
		System.out.println("Year:"+year);
	}
	
	 void mobileBill() {
		 
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("********WELCOME TO VCUBE MOBILE SHOW-ROOM********");
		
		System.out.println("*********************************************");
		
		System.out.println("Enter the Brand of the Mobile :");
		String br=s.next();
		
		System.out.println("Enter the Model of the Mobile :");
		s.nextLine();
		String md=s.next();
		
		System.out.println("Enter Quantity of the Mobile :");
		s.nextLine();
		int qt=s.nextInt();
		
		System.out.println("Enter the Price of the Mobile :");
		double pr=s.nextDouble();
		
		System.out.println("Enter the Delivery Charges of the Mobile :");
		int dc=s.nextInt();
		
		Mobile m = new Mobile();
		m.mobileInfo();
		System.out.println("*************************************");
		System.out.println("Brand:"+br);
		System.out.println("Model:"+md);
		System.out.println("Quantity:"+qt);
		System.out.println("Price:"+pr);
		System.out.println("Delivery Charges:"+dc);
		double Cost=pr*qt;
		double TotalCost=Cost+dc;
		System.out.println("Cost :"+Cost);
		System.out.println("Total Cost :"+TotalCost);
		
		
		
		
		
		
		

//		m.mobileInfo();
//
//		Mobile m1 = new Mobile("Red Magic", "11 Pro", 76299.34, 2025, "Matte Black Cryo");
//		m1.mobileInfo();
//
//		Mobile m2 = new Mobile("IPhone", "18 Pro Max", 329900, 2025, "Glacier");
//		m2.mobileInfo();
	}

}
