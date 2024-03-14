package com.ruby.java.ch02;

public class Test16 {
	
	public static void main(String[] args) {
		byte a = 23;
		int b = a;
		a = (byte) b;
		System.out.println(b);

		byte c =23;
		short d = 47;
		
		byte i = 10;
		byte j = 20;
		byte k = (byte) (i+j); //java에서 +, - 부호는 정수에 대한 부등식이다 . 
}
}
