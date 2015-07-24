package com.hackbulgaria.programming51.week2;

public class Person {
	String firstName;
	String lastName;
	int age;

	public Person() {
	}

	public Person(String firstName, String lastName, int age) {
		firstName = this.firstName;
		lastName = this.lastName;
		age = this.age;
	}

	public String toString() {
		return firstName + " " + lastName + " age: " + age;
	}

}
