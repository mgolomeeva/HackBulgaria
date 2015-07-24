package com.hackbulgaria.programming51.week2;

public class Auto {
	Person owner = new Person();
	int maxSpeed;
	String brand;
	String name;
	double price;

	public Auto() {
	}

	public Auto(Person p) {
		p = this.owner;
	}

	public Auto(int maxSpeed, String brand, String name, double price) {
		maxSpeed = this.maxSpeed;
		brand = this.brand;
		name = this.name;
		price = this.price;

	}

	public String toString() {
		return brand + " " + name + ", Max Speed: " + maxSpeed + ", Price: "
				+ price + ", Owner: " + owner;
	}
}
