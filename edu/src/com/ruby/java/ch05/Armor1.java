package com.ruby.java.ch05;

public class Armor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1");
		System.out.println("2");
		
		String str = takeoff(6,7);
		System.out.println(str);
		
		System.out.println("3");
		System.out.println("4");
		
		// int, boolean , String, long
	}
	static String takeoff(int num1, int num2 ) { 
		System.out.println("take off");
		System.out.println("take off2");
		System.out.println("take off3");
		
		int b = 10; 
		
		return (num1*num2) + "true";
	}
}
