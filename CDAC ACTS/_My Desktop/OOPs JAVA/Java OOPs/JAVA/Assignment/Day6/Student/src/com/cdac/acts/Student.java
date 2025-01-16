package com.cdac.acts;
import com.cdac.acts.enums.TitleEnum;
import com.cdac.acts.utils.DateUtils;

import java.util.Date;



public class Student {

	private int stuId;
	private String name;
	private double marks;
	private Date bd;
	private TitleEnum course;
	private Address permAddress;
	
	private static int idGenerator = 1000;
	
	public Student(String name2, double marks2, Date bod, TitleEnum titleEnum, Address perAddress){
		this.stuId = idGenerator++;
		this.name = "";
		this.marks = 0.0;
		this.bd = null;
		this.course = null;
		this.permAddress = null;
	}

	public Student(int stuId, String name, double marks, Date bd, TitleEnum couse, Address permAddress) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.marks = marks;
		this.bd = bd;
		this.course = couse;
		this.permAddress = permAddress;
	}

	public int getStuId() {
		return stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Date getBd() {
		return bd;
	}

	public void setBd(Date bd) {
		this.bd = bd;
	}

	public TitleEnum getCourse() {
		return course;
	}

	public void setourse(TitleEnum course) {
		this.course = course;
	}

	public Address getPermAddress() {
		return permAddress;
	}

	public void setPermAddress(Address permAddress) {
		this.permAddress = permAddress;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Student.idGenerator = idGenerator;
	}
	

	@Override
	public String toString() {
		return "Employee[stuId=" + stuId 
				+ " name=" + name 
				+ " BD=" + DateUtils.getFormattedDate(bd)
				+ " course=" + course.getValue()
				+ " marks=" + marks 
				+ permAddress.toString() +"]";
	}
	
	
}
