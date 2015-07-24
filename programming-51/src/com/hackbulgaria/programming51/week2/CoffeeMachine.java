package com.hackbulgaria.programming51.week2;

public class CoffeeMachine {
	public Coffee[] brandsOfcoffee;
	public int capacity = 10; // up to 10 coffees
	public int coffeeCount = 0; // how much coffees do we currently have
	public float balance = 0; // how much money we have in the machine

	public CoffeeMachine() {
		this.brandsOfcoffee = new Coffee[capacity]; // masiv s tova capacity
	}

	public CoffeeMachine(int capacity) { // ako iskame poveche capacity
											// suzdavame 2ri konstruktor, koito
											// priema tozi kapacitet
		this.capacity = capacity;// kakvoto sme mu zadali v Main
		this.brandsOfcoffee = new Coffee[capacity];
	}

	public boolean addCoffee(Coffee c) {
		if (coffeeCount < capacity) { // ako imash kapacitet za sedem kafeta ne
										// moje da dobavim 8mo
			brandsOfcoffee[coffeeCount] = c;
			coffeeCount++; // += 1
			// += 1
			return true;
		}
		return false;
	}

	public float buyCoffee(String brand, float price) {

		for (int i = 0; i < coffeeCount; i++) {
			if (brandsOfcoffee[i].brand.equals(brand)) { // ako branda ot indexa
															// ot masiva e ravan
															// na podadeniq
															// brand (ako go
															// ima)
				if (brandsOfcoffee[i].price <= price) { // ako imame dostatuchno
														// pari
					price -= brandsOfcoffee[i].price; // vadim cenata na
														// izbraniq brand
					balance += brandsOfcoffee[i].price; // pribavqme kolko pari
														// sa ostanali v
														// mashinata sled kato
														// sme si kupili
				}

				return price;
			}
		}
		return -1;
	}
}