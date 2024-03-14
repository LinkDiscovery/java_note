package com.ruby.java.ch05;

public class Test01 {

	static void test(int... v) {
		System.out.print(v.length + " : ");
		for(int x : v){// 12,3,4,5,6
			System.out.print(x);
			System.out.print("_");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		test(12,3,4,5,6);
		test(1,2);
		test(1,2,3);
	}
}
