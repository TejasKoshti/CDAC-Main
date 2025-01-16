package com.cdac.actss;

import java.util.Objects;

public class StudentDetails {
	
	private String name;
	private StudentKey key;
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(String standard, Integer division, Integer rollNo, String name) {
		super();
		this.name = name;
		this.key = new StudentKey(standard, division, rollNo);
	}
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", key=" + key + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(key, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDetails other = (StudentDetails) obj;
		return Objects.equals(key, other.key) && Objects.equals(name, other.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentKey getKey() {
		return key;
	}
	public void setKey(StudentKey key) {
		this.key = key;
	}
	
	
	
	
	

}
