package com.cdac.queue;

public interface Queue {
	void enqueue(int element);
	int dequeue() throws QueueException;
	boolean isEmpty();
	void printQueue();
}
