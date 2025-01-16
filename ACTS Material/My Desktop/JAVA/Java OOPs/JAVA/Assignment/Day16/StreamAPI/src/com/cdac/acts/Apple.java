package com.cdac.acts;

import java.util.Objects;

public class Apple {
	
	private Integer weight;
	private String color;
	private String taste;
	public Apple(Integer weight, String color, String taste) {
		super();
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(color, taste, weight);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(color, other.color) && Objects.equals(taste, other.taste) && weight == other.weight;
	}


	public Integer getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + ", taste=" + taste + "]";
	}
	
	public int compareTo(Apple apple) {
		return this.getColor().compareTo(apple.getColor());
	}
	
	

}
