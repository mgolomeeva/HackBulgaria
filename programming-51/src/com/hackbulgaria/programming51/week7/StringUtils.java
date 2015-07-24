package com.hackbulgaria.programming51.week7;

import java.util.Stack;

public class StringUtils {
	public static String reverseStringWithStack(String s) {
		Stack<Character> stack = new Stack<>();
		String reversed = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			stack.push(ch);
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = stack.pop();
			reversed = reversed + ch;

		}
		return reversed;
	}
}
