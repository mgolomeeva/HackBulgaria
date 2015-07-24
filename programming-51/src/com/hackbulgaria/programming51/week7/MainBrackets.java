package com.hackbulgaria.programming51.week7;

import java.util.Scanner;

public class MainBrackets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String brackets = scanner.next();
		System.out.println(Brackets.isCorrect(brackets));
	}

}
