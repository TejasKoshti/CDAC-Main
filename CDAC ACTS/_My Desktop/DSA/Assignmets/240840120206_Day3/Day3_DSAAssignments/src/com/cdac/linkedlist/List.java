package com.cdac.linkedlist;

public interface List {
	void addAtFront(int element);
	void addAtRear(int element);
	int deleteFirstNode();
	boolean isEmpty();
	void print();
	void insertAtIndex(int index, int element);
	void insertAfterValue(int value, int element);
	void reverse();
}
