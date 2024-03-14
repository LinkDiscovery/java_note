package com.ruby.java.ch02;

public class Test03 {

	public static void main(String[] args) {
		
		float exchangeRate = (float)1236.50f;// type casting > 타입 케스팅(explicit conversion)을 할 경우 표시 해주면 좋음 
		String st = "Good Day";
		System.out.println(exchangeRate);
		System.out.println(st);
		
		// TODO Auto-generated method stub
		int num = 2147483647;
		int numSize = Integer.SIZE;
		System.out.println("numSize = " + numSize);
		long d = 2147483648L; //8 byte이면 충분한데 , 
		//따로 할당하지 않으면 4byte로 인식 int로 인식
		// d 변수가 8바이트 확인 방법은? 
		long a = 1234l;
		System.out.println(a);
		int dSize = Long.SIZE;
		System.out.println("dSIZE = " + dSize);
		
	}

}
// the literal 2147483648 of type int is out of range 