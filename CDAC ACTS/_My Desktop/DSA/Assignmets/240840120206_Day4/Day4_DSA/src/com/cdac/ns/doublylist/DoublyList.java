package com.cdac.ns.doublylist;

public class DoublyList implements DList {
	DLNode head;
	DLNode tail;

	public DoublyList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		DLNode newNode = new DLNode(element);
		
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void addAtRear(int element) {
		DLNode newNode = new DLNode(element);
		
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		
		newNode.previous = tail;
		tail = newNode;
	}

	@Override
	public int deleteFirstNode() {
		if(isEmpty()) {
			// todo exception
			return -1;
		}
		
		int data = head.data;
		
		head = head.next;
		head.previous.next = null;
		head.previous = null;
				
		return data;		
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		DLNode current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

	@Override
	public void printBackwards() {
		DLNode current = tail;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println("");
	}

}
