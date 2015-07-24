package com.hackbulgaria.programming51.week5;

public class StaticLinkedList {

	public static LinkedList<Integer> reverse(LinkedList<Integer> l) {// iskame
																		// method
																		// ot
																		// tip
																		// linkedlist
																		// koito
																		// da
																		// vrushta
																		// linked
																		// list
																		// l
		LinkedList<Integer> temp = new LinkedList<>(); // sizdavame nova
														// promenliva prazen
														// linkedlist
		int size = l.size() - 1; // goleminata na linked lista

		for (int i = size; i >= 0; i--) { // ot goleminata dokato goleminata ne
											// stane 0 namalqvai broqcha
			temp.addLast(l.getData(i)); // pribavqi kum noviq list v kraq
										// elementite ot svurzaniq spisuk
		}
		return temp; // vurni noviq spisuk napulnen s elementite ot zad napred
	}

	public static LinkedList<Integer> sort(LinkedList<Integer> l) {
		// Sorts the list
		return null;
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		// Merges a and b into one sorted list
		return null;
	}
}
