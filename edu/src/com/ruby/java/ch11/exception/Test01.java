package com.ruby.java.ch11.exception;

public class Test01 {

	public static void main(String[] args) {
		
		try { 
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length(); // JDK 가 여기서 예외를 잡음(객체를 생성) // new NullPointerException()
			int arr[] = new int[3];
			arr[3] = 30; // "OK"가 찍히지 않았다는 것은 여기서 프로그램이 종료 되었다는 것
						 // new ArrayIndexOutOfBoundsException();
			System.out.println("OK");
			
		} catch(ArrayIndexOutOfBoundsException e1) { // 예외가 발생하면 JDK가 객체를 생성한다. 
			System.out.println(e1.getMessage());
		}catch(NullPointerException e2) {
			e2.printStackTrace();
		}catch(Exception e ) { 
			System.out.println("오류발생 : " + e);
		}
			System.out.println("GOOD");
	}
}

