package com.ConditionalStatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the type of electricity type Like Domestic/Commercial:");
		String etype = sc.next();

		switch (etype) {
		case "Domestic" -> {
			int d_amount;

			System.out.println("Enter the D_Units:");
			int d_units = sc.nextInt();
			if (d_units > 0 && d_units <= 100) {
				d_amount = d_units * 2;
				System.out.println("Total Current Bill:" + d_amount);
			} else if (d_units > 300) {
				d_amount = d_units * 3;
				System.out.println("Total Current Bill:" + d_amount);
			} else {
				System.out.println("Invalid Units !!");
			}
		}
		case "Commercial" -> {
			int c_amount;
			System.out.println("Enter the C_Units:");
			int c_units = sc.nextInt();
			if (c_units > 0 && c_units <= 100) {
				c_amount = c_units * 4;
				System.out.println("Total Current Bill:" + c_amount);
			} else if (c_units > 100 && c_units < 300) {
				c_amount = c_units * 6;
				System.out.println("Total Current Bill:" + c_amount);
			} else if (c_units > 0 && c_units > 300) {
				c_amount = c_units * 8;
				System.out.println("Total Current Bill:" + c_amount);
			} else {
				System.out.println("Invalid Units !!");
			}
			sc.close();

		}
		}

	}

}
