package com.cdac.acts.list.fixed_list;

import com.cdac.acts.list.MyList;
import com.cdac.acts.my_exception.ListFullException;

public class FixedList implements MyList {
	private int size;
	private int[] arr;
	private int index = 0;

	public FixedList (int size) {
		this.size = size;
		arr = new int[size];
	}
	
	@Override
	public void insert(int value) {
		arr[index] = value;
		index++;
	}

	@Override
	public int getValue(int index) {
		return arr[index];
	}

	@Override
	public int remove(int i) {
		int delete = arr[i];
		
		while (i < size-1) {
		swap (arr, i, i+1);
		i++;
		}
		
		if (i == size-1) {
			this.index = this.index - 1;
		}
		
		return delete;
	}
	
	private void swap(int[] arr, int f, int s) {
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}

	public static void main(String[] args) throws ListFullException {
		MyList list = new FixedList(5);
		try {
		System.out.println("insert value: ");
		for (int i = 1; i<=5; i++) {
			if (i > 5) {
				throw new ListFullException ("List index size out of bound");
			}
			list.insert(i*10);
		}
		} catch (ListFullException lfe) {
			System.out.println(lfe.getMessage());
		}
		
		System.out.println("display value: ");
		for (int i = 0; i<5; i++) {
			System.out.println(list.getValue(i));
		}
		
		System.out.println("element remove: ");
		System.out.println(list.remove(2));
		
//		System.out.println("display value: ");
//		for (int i = 0; i<5; i++) {
//			System.out.println(list.getValue(i));
//		}	
		
		list.insert(100);
		
		System.out.println("display value: ");
		for (int i = 0; i<5; i++) {
			System.out.println(list.getValue(i));
		}	
		
	}
}
