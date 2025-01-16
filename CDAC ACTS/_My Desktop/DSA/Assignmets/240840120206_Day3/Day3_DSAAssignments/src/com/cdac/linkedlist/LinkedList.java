package com.cdac.linkedlist;

public class LinkedList implements List {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public LinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		if(isEmpty()) {
			head = new Node(element);
			tail = head;
			return;
		}
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;		
	}

	@Override
	public void addAtRear(int element) {
		if(isEmpty()) {
			head = new Node(element);
			tail = head;
			return;
		}
		Node newNode = new Node(element);
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public int deleteFirstNode() {
		if(isEmpty()) {
			tail = null;
		}
		Node temp = head;
		head = temp.next;
		temp.next = null;
		return temp.data;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void print() {
		Node mov = head;
		while(mov != null) {
			System.out.print(mov.data + " ");
			mov = mov.next;
		}
		System.out.println();
	}

	@Override
	public void insertAtIndex(int index, int element) {
		Node current = head; 
		Node newNode = new Node(element);
		
		if(index == 0 ) {
			addAtFront(element);
			return;
		}
		
		for(int i = 0 ; i < index - 1 && (current != null) ; i++) {
			 current = current.next;
		}
		
		if(current != null) {
			newNode.next = current.next;
			current.next = newNode;
		}
		
		if(current == tail) {
			tail = current.next;
		}
		//TODO Exception
	}

	@Override
	public void insertAfterValue(int value, int element) {
		Node current = head;
		Node newNode = new Node(element);
		
		while(current != null) {
			if(current.data == value) {
				break;
			}
			current = current.next;
		}
		
		if(current == null) {
			System.out.println("Value Not Exception");
			return;
		}
		
		newNode.next = current.next;
		current.next = newNode;
	
	}

	@Override
	public void reverse() {
	    Node current = head;
	    Node previous = null;
	    Node next = null;
	    tail = head; // Set the tail to the current head before we start reversing

	    while (current != null) {
	        next = current.next; // Store the next node
	        current.next = previous; // Reverse the current node's pointer
	        previous = current; // Move the previous pointer one step forward
	        current = next; // Move to the next node
	    }

	    head = previous; // After the loop, previous will be the new head
	}
	

}
