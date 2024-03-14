package com.ruby.java.ch11.exception;

public class Test02 {

	public static void main(String[] args) {
		test1();
		System.out.println("1");
	}

	private static void test1() {
		System.out.println("2");
		test2();

	}


	private static void test2(){
		

		
		try {
			int temp = 10/0;
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("오류발생");
			return;
		} finally { // return 이 있더라도 finally를 진행하고 return 된다.
			System.out.println("OK");
		}
		System.out.println("4");
	}
}
