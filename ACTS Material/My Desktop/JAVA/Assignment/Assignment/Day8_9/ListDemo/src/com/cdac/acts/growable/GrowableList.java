package com.cdac.acts.growable;

import com.cdac.acts.list.MyList;
import com.cdac.acts.list.fixed_list.FixedList;
import com.cdac.acts.my_exception.ListFullException;

public class GrowableList implements MyList{
	private int size;
	private int[] arr;
	private int index = 0;

	public GrowableList(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	@Override
	public void insert(int value) {
		
		if (index == size ) {
			size = size*2;
			int tempArr[] = new int[size];
			
			for (int i = 0; i < arr.length; i++) {
				tempArr[i] = arr[i];
			}
			
			arr = tempArr;
		}
		
		arr[index] = value;
		index++;
	}

	@Override
	public int getValue(int index) {
		return arr[index];
	}
	
	public static void main(String[] args) {
		MyList list = new GrowableList(5);
		for (int i = 1; i<=11; i++) {
			list.insert(i*10);
		}
		for (int i = 0; i<11; i++) {
			System.out.print(list.getValue(i) + " ");
		}
	}
}
