package com.hackbulgaria.programming51.week2;

public class Main {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Coffee java = new Coffee();
		Coffee latte = new Coffee();

		java.brand = "Java";
		java.price = 1.00;

		latte.brand = "Latte";
		latte.price = 1.50;

		cm.addCoffee(java);
		cm.addCoffee(latte);

		System.out.println(cm.buyCoffee("Latte", (float) 3.40));
		System.out.println("Current balance: " + cm.balance);
	}
}
// public static void main2 (String[] args) {
// TODO Auto-generated method stub
// Coffee Lavatzza = new Coffee();
// Lavatzza.brand = "Lavatzza";
// Lavatzza.price = 5.5;

// System.out.println(Lavatzza);

