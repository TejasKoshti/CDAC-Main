package com.cdac.ns.singlylist;

import com.cdac.ns.doublylist.DList;
import com.cdac.ns.doublylist.DoublyList;

public class day4App {

	public static void testInsert() {
		SortedList list = new SortedSinglyList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(3);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(5);
		list.insert(5);
		
		
		list.print();
		
		list.deleteAll(5);
		
		//System.out.println(list.search(3));
		
		list.print();
	}

	public static void testDListAddAtFront() {
		DList list = new DoublyList();
		
		list.addAtFront(5);
		list.addAtFront(10);
		
		list.print();
		list.printBackwards();
	}
	
	public static void testDListAddAtRear() {
		DList list = new DoublyList();
		
		list.addAtRear(25);
		list.addAtRear(10);
		list.addAtFront(20);
		list.addAtFront(30);
		
		list.print();
		
		System.out.println(list.deleteFirstNode());
		
		list.print();
		//list.printBackwards();
	}

	public static void main(String[] args) {
		//testInsert();
		//testDListAddAtFront();
		testDListAddAtRear();
	}

}
