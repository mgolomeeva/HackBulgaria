package com.hackbulgaria.programming51.week1;

import java.util.Scanner;
// update update
// pak update
public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();

		System.out.println(a);
		System.out.println(oper);
		System.out.println(b);

		int sum = a + b;
		int min = a - b;
		int multiply = a * b;
		int divide = a / b;

		if (oper == '+') {
			System.out.println(sum);
		}

		if (oper == '-') {
			System.out.println(min);
		}

		if (oper == '*') {
			System.out.println(multiply);
		}

		if (oper == '/') {
			System.out.println(divide);
		}

		if (oper == '^') {
			int exponention = 1;
			for (int i = 0; i < b; i++) {
				exponention = exponention * a;
			}
			System.out.println(exponention);
		}

		if (oper == '?' && a > 0 && b > 0) {
			int aFactorial = 1;
			for (int i = 1; i <= a; i++) {
				aFactorial = i * aFactorial;
			}

			int bFactorial = 1;
			for (int i = 1; i <= b; i++) {
				bFactorial = i * bFactorial;
			}

			System.out.println(aFactorial + bFactorial);
		}
	}
}
