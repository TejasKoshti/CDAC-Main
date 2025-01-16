package com.cdac.fixedstack;

public interface Stack<T> {
    T pop() throws StackException;
    T peak();
    boolean isEmpty();
    boolean isFull();
    void push(T element) throws StackException;
}
