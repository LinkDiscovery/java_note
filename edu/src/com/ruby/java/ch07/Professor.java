package com.ruby.java.ch07;

public class Professor extends Person {

	private String subject;

	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor 생성자");
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;

	
		
	//return super.toString() + ":" + subject	
	}

	@Override
	public String toString() {
		return super.toString() + ":" + subject;
	}


	}
