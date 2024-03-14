package com.ruby.java.ch07;

public class Person {

	 private String name;
	 private int age;

	 public Person() {
		 System.out.println("person 생성자");
}

	 public Person(String name, int age) {
		 this.name = name;
		 this.age = age;
		
		System.out.println("person 생성자");// TODO Auto-generated constructor stub
	}
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	 
}