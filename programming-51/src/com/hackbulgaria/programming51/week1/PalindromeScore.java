package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class PalindromeScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int counter = 1;
		int temp = n;

		while (true) {
			int ntemp = n;
			int reverse = 0;
			while (ntemp > 0) {
				reverse = (reverse * 10) + ntemp % 10;
				ntemp = ntemp / 10;
			}
			if (temp == reverse) {
				break;
			}
			temp = temp + reverse;
			counter++;
		}
		System.out.println(counter);
	}
}
