package com.cdac.doublylinkedlist;

public interface SortedDList {
	void insert(int element);
	void delete(int element) throws NoElementFoundException;
	void deleteAll(int element);
	boolean search(int element);
	void print();
	void printBackwards();
}
