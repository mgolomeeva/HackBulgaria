package com.hackbulgaria.programming51.week5;

public class LinkedList<T> { // we want to know which is the head and the tail
	private Node<T> head;
	private Node<T> tail;

	public LinkedList() {
		head = null;
		tail = null; // empty linked list
	}

	public void addLast(T data) { // we want to add to the end of the list
		Node<T> temp = new Node<T>(data); // we make a new node --- data comes
											// from the Node constructor
		if (head == null) { // if this is the 1st element
			head = temp;
		} else {
			tail.next = temp; // let the next element of the tail be the new
								// node we created
		}
	}

	public T getData(int index) {
		return getElement(index).data;

	}

	public Node<T> getElement(int index) {
		int counter = 0;
		Node<T> temp = head;
		while (temp != null) { // until the element reaches null/the end iterate
			if (counter == index) { // if the index is
				break; // stop the loop and return the result
			}
			temp = temp.next;
			counter++;
		}
		return temp;
	}

	public void insertArter(int index, T data) {// we insert an element after
												// another
		Node<T> temp = new Node<T>(data); // we make a new node
		Node<T> el = getElement(index);

		temp.next = el.next; // we change the position of the elements
		el.next = temp;
	}

	public void remove(int index) {
		if (index == 0) { // ako e nuleviq element
			head = head.next;
		}
		Node<T> temp = getElement(index - 1); // we find the previous element
		temp.next = temp.next.next; // temp e == na sledvashtiq element
									// sledvashtiq /preslachame edin element
	}

	public String toString() {
		String str = "[";
		Node<T> temp = head;
		while (temp.next != null) {
			str += temp.data + ", "; // slagame si ,
			temp = temp.next;
		}
		return str + temp.data + " ]";
	}

	public void clear() {
		head = null; // maha vsichki elementi ot spisuka

	}

	public int size() {
		int counter = 0;
		Node<T> temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}
}
