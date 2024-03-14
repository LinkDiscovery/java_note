package com.ruby.java.ch02;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		
		Scanner scoreCase1 = new Scanner(System.in);
		System.out.print("Num: ");
		int num = scoreCase1.nextInt();
		
		
		int i = 0;			// 제어 변수 선언 및 초기화 
		
		while(i<num) {		// 조건식
			
			System.out.println(i);	// 실행식
			
			i++;					// 증감식
		}
		System.out.println("ok");
		
	}

}
