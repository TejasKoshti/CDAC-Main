package com.cdac.fixedstack;

public class FixedSizeStack<T> implements Stack<T> {
    private T[] stackData;
    private int top;

    @SuppressWarnings("unchecked")
    public FixedSizeStack(int sizeOfArray) {
        this.stackData = (T[]) new Object[sizeOfArray];
        this.top = -1;
    }

    @Override
    public void push(T element) throws StackException {
        if (isFull()) {	
            throw new StackException("Stack Overflow");
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
   
}
