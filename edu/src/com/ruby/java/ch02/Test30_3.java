package com.ruby.java.ch02;

public class Test30_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 정수의 자릿수를 입력받아서 해당 자릿수에 속하는 
//소수를 찾아서 출력하는 프로그램을 작성해 보세요
//ex 입력 자릿수가 3이라면 3자릿수 정수(100~999) 중에서 소수에 해당하는 
//숫자를 찾아서 출력
	
		//숫자를 받는다.
		//길이를 확인한다
		  //길이가 같다면 소수 출력
		  //길이가 다르다면 
		//
		int num = 7;
		
		int i =2;

		for(i=2; i<num; i++) {
		if(num%i==0) { 
		break;
		}
		}
		System.out.println( i<num ? "소수가 아닙니다.":"소수입니다.");
		
		
	}

}
