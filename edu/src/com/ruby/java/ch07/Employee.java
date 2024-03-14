package com.ruby.java.ch07;

public class Employee extends Person {

	Employee link;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int age, String dept) {
		super(name,age);
		this.dept=dept;
		// TODO Auto-generated constructor stub
	}
	
	
	
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
		
	
	}

	@Override
	public String toString() {
		return super.toString() +" "+dept;
	}
}
