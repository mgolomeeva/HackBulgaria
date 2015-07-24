package com.hackbulgaria.programming51.week5;

public class Node<T> {
	public T data; // generic type of the data (depends on the input)
	public Node<T> next; // the next node -- there will be an object in future

	public Node(T data) {
		this.data = data;
		next = null; // if u add at the end this will be the end of the linked
						// list
	}
}