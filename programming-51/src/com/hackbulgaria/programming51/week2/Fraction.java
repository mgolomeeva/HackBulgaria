package com.hackbulgaria.programming51.week2;

public class Fraction {
	double num;
	double den;

	// public Fraction() {

	// }
	public Fraction(double num, double den) {
		this.num = num;
		this.den = den;
	}

	public Fraction(int n) {
		this(n, 1);
	}

	public Fraction() {
		num = 0;
		den = 1;
	}

	public String toString() {
		double thisGcd = gcd(num, den);

		return (num / thisGcd + "/" + den / thisGcd);
	}

	static private int gcd(double num2, double den2) {
		return 1;
	}

	public double getReal() {
		return num / den;
	}

	public void sum(Fraction F) {

	}
}
