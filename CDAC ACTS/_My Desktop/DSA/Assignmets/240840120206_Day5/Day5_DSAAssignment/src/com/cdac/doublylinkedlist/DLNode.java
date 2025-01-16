package com.cdac.doublylinkedlist;

public class DLNode {
	int data;
	DLNode next;
	DLNode previous;
	
	public DLNode() {
		this.data = 0;
		next = null;
		previous = null;
	}
	
	public DLNode(int data) {
		this.data = data;
		next = null;
		previous = null;
	}
}
