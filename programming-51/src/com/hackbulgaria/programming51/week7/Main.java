package com.hackbulgaria.programming51.week7;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();
		for (int i = 10; i < 20; i++) {
			q.push(i);
		}
		System.out.println(Main.get(5, q));

	}

	public static int get(int index, Queue<Integer> q){
	int num;
	for(int i = 1; i< index; i ++){
		q.pop();
	}
 return q.peek()
}
}
