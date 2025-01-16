package com.cdac.growablestack;

import java.util.Arrays;

import com.cdac.fixedstack.Stack;
import com.cdac.fixedstack.StackException;

public class GrowableStack<T> implements Stack<T> {
	private T[] stackData;
    private int top;
    private final int SIZE_INC = 10;

    @SuppressWarnings("unchecked")
    public GrowableStack() {
        this.stackData = (T[]) new Object[SIZE_INC];
        this.top = -1;
    }

    @Override
    public void push(T element) {
        if (isFull()) {	
           resizeStack();
        }
        stackData[++top] = element;
    }

    @Override
    public T pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow");
        }
        return stackData[top--];
    }

    @Override
    public T peak() {
        return isEmpty() ? null : stackData[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1; // Returns true if the stack is empty
    }

    @Override
    public boolean isFull() {
        return top == stackData.length - 1; // Returns true if the stack is full
    }
    
    @SuppressWarnings("unchecked")
	private void resizeStack() {
    	
		//T[] newStackData = (T[]) new Object[SIZE_INC * 2];
		T[] newStackData1 = Arrays.copyOf(stackData, 2 * SIZE_INC);
    	
//    	for(int i = 0 ; i < SIZE_INC ; i++) {
//    		newStackData[i] = stackData[i];
//    	}
    	
    	stackData = newStackData1;    	
    }
}
