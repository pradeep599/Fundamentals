package com.javaconstuctors;

public class Product {

	int productId;
	String productName;
	double price;
	int quantity;

	Product(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;

	}

	Product(Product p1, int quantity) {
		this.productId = p1.productId;
		this.productName = p1.productName;
		this.price = p1.price;
		this.quantity = quantity;

	}

	void calculateTotal() {
		System.out.println("*****************************");
		System.out.println("Product ID:" + productId);
		System.out.println("Product Name:" + productName);
		System.out.println("Price:" + price);
		System.out.println("Quantity:" + quantity);
	}

	public static void main(String[] args) {
		System.out.println("------------WELCOME TO VCUBE ENTERPRICESS-----------");

		Product p1 = new Product(101, "Asus Tuff Gaming", 120000.56, 3);
		p1.calculateTotal();

		Product p2 = new Product(p1, 5);
		p2.calculateTotal();

		double P1Cost = p1.quantity * p1.price;
		double P2Cost = p2.quantity * p2.price;
		double TotalCost = P1Cost + P2Cost;
		System.out.println("Total Cost:" + TotalCost);

	}

}
