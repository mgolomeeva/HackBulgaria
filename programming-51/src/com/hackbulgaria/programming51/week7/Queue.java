package com.hackbulgaria.programming51.week7;

public class Queue implements List {

	public Node<T> head;
	public Node<T> tail;

	public Queue(){
	head = null;
	tail = null;
	}
		@Override
	public void push(Object data) {
		if(empty()){
			head = new Node<T>(data);
			tail = head;
		}else {
			tail.next =  new Node(data);
			tail = tail.next;
			}	
		}
		@Override
	public void pop() {
	head = head.next;
	}
		@Override
	public void size() {
			int counter = 0;
			Node<T> temp = head;
			while(temp!= null)
				counter ++;
				temp = temp.next;
		}
	}


	public boolean empty(){
			return head == null;
		}
	}
	
	public String toString(){
		String str = "[";
		Node<T> temp = head;
		while(temp.next != null){
			str += temp.data + ",";
			temp= temp.next
		}
			
	public void  Queue<T> copy(){
		Queue<T> q = 
		Node<T> temp = head;
		while(temp!=null){
			q.push(temp.data);
			temp = temp.next;
		}
	}
	@Override
	public void peek() {
		
	}
	
		}
	}