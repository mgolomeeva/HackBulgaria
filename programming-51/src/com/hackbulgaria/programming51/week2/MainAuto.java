package com.hackbulgaria.programming51.week2;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ivan = new Person();
		ivan.firstName = "Ivan";
		ivan.lastName = "Ivanov";
		ivan.age = 25;

		Auto audi = new Auto();

		audi.owner = ivan;
		audi.maxSpeed = 200;
		audi.brand = "Audi";
		audi.name = "Begachka";
		audi.price = 5000;

		System.out.println(audi);
	}

}
