package com.hackbulgaria.programming51.week2;

public class AutoShop {
	Auto[] cars;

	public AutoShop(Auto[] cars) {
		cars = new Auto[0];
	}

	public void addCar(Auto car, int position) {
		for (int i = 0; i < cars.length; i++) {
			if (cars.length + 1 >= position && position >= 1) {
				i = position;
				cars[i] = car;
			}
		}
	}

	public int getTopSpeed() { // can it be integer type instead of Auto?
		int max = 0;
		for (Auto car : cars) {
			if (car.maxSpeed > max) {
				max = car.maxSpeed;
			}
		}
		return max;
	}
}
// public String toString(){
// return
// }

