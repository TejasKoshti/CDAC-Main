package com.cdac.queue;

import com.cdac.linkedlist.LinkedList;

public class QueueList implements Queue {
	
	LinkedList ll = new LinkedList();

	@Override
	public void enqueue(int element) {
		ll.addAtRear(element);
	}

	@Override
	public int dequeue() throws QueueException {
		if(isEmpty()) {
			throw new QueueException("Hogaya Queue Khali");
		}
		return ll.deleteFirstNode();
	}

	@Override
	public boolean isEmpty() {
		return ll.isEmpty();
	}

	@Override
	public void printQueue() {
		ll.print();		
	}	
	
}
