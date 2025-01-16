package com.acts.generic;

public class GenericType<T> {
	
	private T num1;
	public GenericType(T num1) {
		super();
		this.num1 = num1;
	}
	
	public T grtNum1() {
		return num1;
	}
	
	public void setNum1(T num1) {
		this.num1 = num1;
	}
	
	@Override
	public String toString()
	{
		return "GenericType [num1 = ]"+ num1 +  "]";
	}

}
