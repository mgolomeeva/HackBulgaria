package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int reverse = 0;
		int temp = n;
		while (temp > 0) {
			reverse = (reverse * 10) + temp % 10;
			temp = temp / 10;
		}
		int sum = n + reverse;
		int palindSum = 0;
		while (sum > 0) {
			palindSum = (palindSum * 10) + sum % 10;
			sum = sum / 10;
		}

		if (palindSum == n + reverse) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
