package com.hackbulgaria.programming51.week2;

public class Fridge {
	Food[] foodFridge;
	double capacity;
	double weight;
	int foodCount;

	public Fridge() {

	}

	public Fridge(Food[] foodFridge, double capacity, double weight) {
		this.foodFridge = foodFridge;
		this.capacity = capacity;
		this.weight = weight;

	}

	public boolean addFood(Food f) {
		if (foodCount < capacity) {
			foodFridge[foodCount] = f;
			foodCount++;

			return true;
		}
		return false;

	}

	// public int getFoodsCount() {

	// }
}
