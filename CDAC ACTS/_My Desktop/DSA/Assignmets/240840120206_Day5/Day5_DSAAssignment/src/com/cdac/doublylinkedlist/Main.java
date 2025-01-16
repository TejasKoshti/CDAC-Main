package com.cdac.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		SortedDoublyList sdl = new SortedDoublyList();
		
		sdl.insert(1);
		sdl.insert(1);
		sdl.insert(1);
		sdl.insert(4);
		sdl.insert(5);
		sdl.insert(6);
		sdl.insert(7);
		sdl.insert(8);
		sdl.insert(8);
		sdl.insert(8);
		sdl.insert(8);
		
		
		sdl.print();
		
//		try {
//			
//		} catch (NoElementFoundException e) {
//			System.out.println(e.getMessage());
//		}
		sdl.deleteAll(8);
		sdl.deleteAll(1);
		sdl.print();
		sdl.deleteAll(7);
		sdl.deleteAll(6);
		sdl.deleteAll(5);
		sdl.deleteAll(4);
		
		sdl.print();
		sdl.printBackwards();
		
	}

}
