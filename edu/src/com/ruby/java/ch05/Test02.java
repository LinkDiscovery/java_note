package com.ruby.java.ch05;

public class Test02 {

	
		static void test(String name, int... v) {
			System.out.print(name + " : ");
			for(int x : v)
				System.out.print(x+" ");
			System.out.println();
		}
		public static void main(String[] args) {
			test("오정임",12,3,4,5,6);
			test("김푸름",1,2);
			test("김하늘",1,2,3);
		}
	}

