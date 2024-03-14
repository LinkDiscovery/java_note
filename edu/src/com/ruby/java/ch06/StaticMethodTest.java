package com.ruby.java.ch06;

public class StaticMethodTest {
	
	int num = 123;
	
	public static void main(String[] args) {

		StaticMethodTest exam = new StaticMethodTest();
		StaticMethodTest.print1();
		exam.print2();

	}
	
		public static void print1() {

		//	int num2 = num;
			System.out.println("hello");
		}
		
		public void print2() {

			int num3 = num;
			System.out.println("java");
		}
	}


