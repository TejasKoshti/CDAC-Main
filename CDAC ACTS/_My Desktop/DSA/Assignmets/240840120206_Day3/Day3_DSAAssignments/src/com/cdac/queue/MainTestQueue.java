package com.cdac.queue;

public class MainTestQueue {

	public static void main(String[] args) {
		QueueList ql = new QueueList();
		
		
		ql.enqueue(10);
		ql.enqueue(11);
		ql.enqueue(12);
		ql.enqueue(13);
		ql.enqueue(14);
		ql.enqueue(15);
	
		ql.printQueue();
		
		try {
			
			System.out.println(ql.dequeue());
			System.out.println(ql.dequeue());
			System.out.println(ql.dequeue());
			System.out.println(ql.dequeue());
			System.out.println(ql.dequeue());
			System.out.println(ql.dequeue());
			System.out.println(ql.dequeue());

		} catch (QueueException e) {
			System.out.println(e.getMessage());
		}
		
		
		ql.printQueue();
	}

}
