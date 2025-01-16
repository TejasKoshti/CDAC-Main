package com.cdac.doublylinkedlist;

public class SortedDoublyList implements SortedDList{
	DLNode head;
	DLNode tail;

	public SortedDoublyList() {
		super();
		this.head = null;
		this.tail = null;
	}

	@Override
	public void insert(int element) {
		DLNode newNode = new DLNode(element);
		
		DLNode current = head;
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		while(current != null) {
			if(current.data > element) {
				break;
			}
			current = current.next;
		}
		
		if (current == head) {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
			return;
		}
		
		if (current == null) {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			return;
		}
		
		newNode.next = current;
		newNode.previous = current.previous;
		current.previous.next = newNode;
		current.previous = newNode;		
	}

	@Override
	public void delete(int element) throws NoElementFoundException {
		DLNode current = head;
		
		if(current.data == element) {
			head = head.next;
			head.previous = null;
			return;
		}
		
		while(current != null) {
			if(current.data == element) {
				break;
			}
			current = current.next;
		}
		
		if(current == null) {
			throw new NoElementFoundException("No Element Found!!");
		}
		
		if(current == tail) {
			tail = current.previous;
			tail.next = null;
			return;
		}
		
		current.previous.next = current.next;
		current.next.previous = current.previous;
	}

	@Override
	public void deleteAll(int element) {
		
		if(head == null) {
			System.out.println("DLL Emptyh");
			return;
		}
			
		if(head.data == element) {
			head = head.next;
			if(head == null) {
				tail = null;
				return;
			}
			head.previous = null;
		}
		
		DLNode current = head;
		
		while(current != null) {
			if(current.data == element) {
				if(current == head) {
					head = head.next;
					head.previous = null;
				}else if(current == tail){
					break;
				}else {
					current.previous.next = current.next;
					current.next.previous = current.previous;
				}
			}
			current = current.next;
		}
		
		if(current == tail) {
			tail = current.previous;
			tail.next = null;
		}
					
	}

	@Override
	public boolean search(int element) {
		DLNode current = head;
		
		while(current != null) {
			if(current.data == element) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void print() {
		DLNode current = head;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		
	}

	@Override
	public void printBackwards() {
		DLNode current = tail;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println();
	}
	
}
