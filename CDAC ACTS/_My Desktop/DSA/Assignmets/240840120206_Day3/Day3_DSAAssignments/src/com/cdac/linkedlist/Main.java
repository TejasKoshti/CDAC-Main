package com.cdac.linkedlist;

public class Main {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.addAtFront(1);
		ll.addAtFront(2);
		ll.addAtFront(3);
		ll.addAtFront(4);
		ll.addAtFront(4);
		ll.addAtFront(4);
		ll.addAtFront(4);
		ll.addAtFront(4);
		ll.addAtFront(4);
		
		
//		ll.addAtRear(4);
//		ll.addAtRear(3);
//		ll.addAtRear(2);
//		ll.addAtRear(1);
		
		ll.print();
		
		ll.reverse();
		
		ll.print();
		
//		System.out.println(ll.deleteFirstNode());
//		System.out.println(ll.deleteFirstNode());
//		System.out.println(ll.deleteFirstNode());
//		System.out.println(ll.deleteFirstNode());
		
//		ll.print();
//		
//		//ll.insertAtIndex(2, 10);
//		ll.insertAfterValue(0, 10);
//		
//		ll.print();
	}
}
