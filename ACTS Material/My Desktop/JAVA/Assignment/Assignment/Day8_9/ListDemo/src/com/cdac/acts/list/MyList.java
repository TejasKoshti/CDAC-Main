package com.cdac.acts.list;

public interface MyList {
	void insert(int value);
	int getValue(int index);
	
	default int remove(int index) {
		return 0;
	}
}
