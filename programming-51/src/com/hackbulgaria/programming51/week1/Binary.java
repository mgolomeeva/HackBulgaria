package com.hackbulgaria.programming51.week1;

public class Binary {

	public String toBinary(int n) {
		String binary = "";
		while (n > 0) {
			int lastDigit = n % 2;
			binary = lastDigit + binary;

			n = n / 2;
		}
		return binary;
	}

	public static int toNumber(String binary) {
		int n = 0;
		int len = binary.length() - 1;
		for (int i = len; i >= 0; i--) {
			if (binary.charAt(i) == '1') { // This method returns the character
											// located at the String's specified
											// index.
				n += pow(2, (len - i));// This method Returns the value of the
										// first argument raised to the power of
										// the second argument
			}
		}
		return n;
	}

	public static int pow(int num, int power) {
		int sum = 1;
		for (int i = 0; i < power; i++) {
			sum *= num;
		}
		return sum;
	}

	public static int countBits(int n) {// counts the bits in a decimal number.
										// That is, the length of the binary
										// number, without the leading zeroes.
		int counter = 0;
		while (n > 0) {
			n = n / 2;
			counter++;
		}
		return counter;
	}

	public static boolean isPowerOfTwo(String binary) {// that returns if the
														// String binary is a
														// power of two.
		int counter = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				counter++;
			}
		}
		return counter == 1;
	}

}
