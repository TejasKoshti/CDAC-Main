package com.cdac.ns.singlylist;

public class SortedSinglyList implements SortedList {
	SLNode head;
	
	public SortedSinglyList() {
		head = null;
	}

	@Override
	public void insert(int element) {
		SLNode newNode = new SLNode(element);
		
		if (head == null) {
			head = newNode;
			return;
		}
		
		SLNode current = head;
		SLNode previous = null;
		
		while (current != null) {
			if (current.data > newNode.data) {
				break;
			}
			previous = current;
			current = current.next;
		}
		
		if (previous == null) { // or current == head
			newNode.next = head;
			head = newNode;
			return;
		}
		
		previous.next = newNode;
		newNode.next = current;
	}

	@Override
	public void delete(int element) {
		SLNode current = head;
		
		if(current.data == element) {
			head = current.next;
			current.next = null;
		}
		
		while(current != null) {
			if(current.next.data == element) {
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
		
		if(current == null) {
			System.out.println("Value not found");
			return;
		}
			
	
// Method 2
//		SLNode current = head;
//		SLNode previous = null;
//		
//		while(current != null) {
//			if(current.data == element) {
//				break;
//			}
//			previous = current;
//			current = current.next;
//		}
//		
//		if(current == null) {
//			System.out.println("Value not found");
//			return;
//		}
//		
//		previous.next = current.next;
//		current.next = null;
	}

	@Override
	public void deleteAll(int element) {
		
	    while (head != null && head.data == element) {
	        head = head.next; 
	    }

	    if (head == null) {
	        System.out.println("All nodes with value " + element + " deleted");
	        return;
	    }

	    SLNode current = head;

	    while (current != null && current.next != null) {
	        if (current.next.data == element) {
	            current.next = current.next.next; 
	        } else {
	            current = current.next; 
	        }
	    }

	    if (head.data != element && current.next == null) {
	        System.out.println("Value not found");
	    }
		
		
// Method 2	
//		SLNode current = head;
//		SLNode previous = null;
//		
//		while(current != null) {
//			if(current.data == element) {
//				previous.next = current.next;
//				current.next = null;
//				current = previous.next;
//				continue;
//			}
//			previous = current;
//			current = current.next;
//		}
//		
//		if(current == null) {
//			System.out.println("Value not found");
//			return;
//		}
	}

	@Override
	public boolean search(int element) {
		SLNode current = head;
		
		while(current != null) {
			if(current.data == element) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}

	@Override
	public void print() {
		SLNode current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

}
