package com.cdac.queue;

public class FixedQueue<T> implements Queue<T> {
	private int front;
	private int rear;
	private T[] queueData;
	
	@SuppressWarnings("unchecked")
	public FixedQueue(int size) {
		super();
		this.front = 0;
		this.rear = -1;
		this.queueData = (T[]) new Object[size];
	}

	@Override
	public void enqueue(T element) throws QueueException {
		if(isFull()) {
			throw new QueueException("Queue Full");
		}
		queueData[++rear] = element;
	}

	@Override
	public T dequeue() throws QueueException {
		if(isEmpty()) {
			throw new QueueException("Queue Empty");
		}
		return queueData[front++];
	}

	@Override
	public boolean isEmpty() {
		return front == queueData.length;
	}

	@Override
	public boolean isFull() {
		return rear == queueData.length - 1;
	}

}
