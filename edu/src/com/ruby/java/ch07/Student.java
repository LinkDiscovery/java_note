package com.ruby.java.ch07;

public class Student extends Person {

	private String major;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + " " +major;
	}
	
}
