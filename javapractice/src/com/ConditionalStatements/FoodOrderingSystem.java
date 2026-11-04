package com.ConditionalStatements;

import java.util.Scanner;

public class FoodOrderingSystem {
	
	void foodMenuInfo(){
		System.out.println("1 → Pizza – ₹200");
		System.out.println("2 → Burger – ₹120");
		System.out.println("3 → Biryani – ₹180");
		System.out.println("4 → Noodles – ₹100");
		System.out.println("*************************");
	}

	void main() {
		
		double total;
		Scanner sc=new Scanner(System.in);
		foodMenuInfo();
		
		System.out.println("Select an Item:");
		int Item=sc.nextInt();
		
		System.out.println("Enter Quantity:");
		int qnt=sc.nextInt();
		
		switch(Item) {
		case 1->{
			System.out.println("Pizza – ₹200");
			double price=200;
			total=price*qnt;
			System.out.println("Total Price is:"+total);
			}
		case 2->{
			System.out.println("2 → Burger – ₹120");
			total=Item*qnt;
			}
		
		}
	}
		
		
	}

