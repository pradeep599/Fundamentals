package com.javaconstuctors;

public class Vehicle {
	String type;

	Vehicle(String type) {
		this.type = type;

	}

}

class Car extends Vehicle {

	String brand;
	double price;

	Car(String type, String brand, double price) {
		super(type);
		this.brand = brand;
		this.price = price;

	}

}

class ElectricCar extends Car {

	String batteryCapacity;

	ElectricCar(String type, String brand, double price, String batteryCapacity) {

		super(type, brand, price);
		this.batteryCapacity = batteryCapacity;

	}

	public static void main(String[] args) {
		System.out.println("***********WELCOME TO DETAILS OF THE CARS**********");

		ElectricCar ec1 = new ElectricCar("Electric", "Scoda", 300000, "40-Amp");
		ec1.display();

	}

	void display() {
		System.out.println("Type:" + type);
		System.out.println("Brand :" + brand);
		System.out.println("Price:" + price);
		System.out.println("Battery Capacity:" + batteryCapacity);
	}

}