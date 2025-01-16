package com.cdac.acts.apple;

import java.util.Objects;

public class Apple {

	private Integer weight;
	private String color;
	private String taste;

	public Apple(Integer weight, String color, String taste) {
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public String getColor() {
		return this.color;
	}

	public String getTaste() {
		return this.taste;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.weight, this.color, this.taste);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o == null)
			return false;
		
		if(o == this)
			return true;
		
		if(o.getClass() != this.getClass())
			return false;
		
		Apple other = (Apple) o;
		return this.getWeight() == other.getWeight()
				&& Objects.equals(this.getColor(), other.getColor())
				&& Objects.equals(this.getTaste(), other.getTaste());
	}

	@Override
	public String toString() {
		return "Apple [ Weight: " + this.weight + ", Color: " + this.color + ", Taste: " + this.taste + " ]";
	}
}
