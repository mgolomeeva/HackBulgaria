package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class BirthdayRanges {
	public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays,
			Vector<IntPair> ranges) {
		Vector<Integer> result = new Vector<Integer>();
		for (IntPair element : ranges) { // for each pair in ranges
			int counter = 0; // make a counter -- we put it here in order to
								// update it when iterating
			for (Integer date : birthdays) { // for each date in the range of
												// birthdays
				if (date >= element.start && date <= element.end) { // if the
																	// date is
																	// >= start
																	// of the
																	// range and
																	// <= end of
																	// the range
					counter++;// increase the counter
				}
			}
			result.addElement(counter); // add the element in the counter
		}
		return result; // return the result
	}

	public static void main(String[] args) {
		Vector<Integer> birthdays = new Vector<Integer>();
		Vector<IntPair> ranges = new Vector<IntPair>();

		Scanner scanner = new Scanner(System.in);

		int bdaysCount = scanner.nextInt(); // asks for an interval of dates for
											// which we would like to know

		for (int i = 0; i < bdaysCount; i++) {
			birthdays.add(scanner.nextInt());
		}

		int rangesCount = scanner.nextInt(); // # of ranges --we ask the user to
												// add a range

		for (int i = 0; i < rangesCount; i++) {
			IntPair pair = new IntPair();

			pair.start = scanner.nextInt();// start # of ranges
			pair.end = scanner.nextInt();// end # of ranges

			ranges.add(pair);
		}

		System.out.println("Result is:");
		Vector<Integer> result = birthdaysCount(birthdays, ranges);

		for (int count : result) { // for (each==count index) in result count
			System.out.print(count);
			System.out.print(", ");
		}
	}
}