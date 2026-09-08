package com.javapractice;

public class Practice {
	
	static int customerIDGen=100;
	
	{
	  customerID=customerIDGen++;
	}
	
	int customerID;
	String productName;
	int totalAmount;

	public static void main(String[] args) {
		
	Practice Customer1=new Practice();
	Practice Customer2=new Practice();
	Practice Customer3=new Practice();
	Practice Customer4=new Practice();
	Practice Customer5=new Practice();
	
	Customer1.productName="Asus Tuf Gamming Laptop";
	Customer1.totalAmount=50000;
	
	Customer2.productName="HP Keyboad";
	Customer2.totalAmount=500;
	
	Customer3.productName="Dell Mouse";
	Customer3.totalAmount=200;
	
	Customer4.productName="Sony Sound Bar";
	Customer4.totalAmount=20000;
	
	Customer5.productName="Iphone 18 pro max";
	Customer5.totalAmount=100000;
	
	System.out.println("customerID:"+Customer1.customerID);
	System.out.println("ProductName:"+Customer1.productName);
	System.out.println("Total Amount:"+Customer1.totalAmount);
	
	System.out.println("customerID:"+Customer2.customerID);
	System.out.println("ProductName:"+Customer2.productName);
	System.out.println("Total Amount:"+Customer2.totalAmount);
	
	System.out.println("customerID:"+Customer3.customerID);
	System.out.println("ProductName:"+Customer3.productName);
	System.out.println("Total Amount:"+Customer3.totalAmount);
	
	System.out.println("customerID:"+Customer4.customerID);
	System.out.println("ProductName:"+Customer4.productName);
	System.out.println("Total Amount:"+Customer4.totalAmount);
	
	System.out.println("customerID:"+Customer5.customerID);
	System.out.println("ProductName:"+Customer5.productName);
	System.out.println("Total Amount:"+Customer5.totalAmount);
	}

}
