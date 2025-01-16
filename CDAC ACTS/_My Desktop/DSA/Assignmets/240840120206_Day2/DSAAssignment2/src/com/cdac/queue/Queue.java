package com.cdac.queue;

public interface Queue<T> {
	void enqueue(T element) throws QueueException;
	T dequeue() throws QueueException;
	boolean isEmpty();
	boolean isFull();
}
