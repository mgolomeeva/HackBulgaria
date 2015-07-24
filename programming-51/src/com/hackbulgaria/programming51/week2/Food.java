package com.hackbulgaria.programming51.week2;

public class Food {
	String name;
	String[] type = { "Milk", "Sweet", "Vegetable", "Fruit", "Bevarage" };
	double weight = 0;

	public Food(String name, String[] type, double weight) {
		this.name = name;
		this.type = type;
		this.weight = weight;
	}

	public String toString() {
		return name + " " + type + " " + weight;
	}
}
