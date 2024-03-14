package com.ruby.java.ch02;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// 시스템 입력 장치 선언 >> 키보드 
		Scanner sc = new Scanner(System.in);
		
		// 입력 메시지 출력
		System.out.print("점수: ");
		
		//시스템 입력 장치로 부터 정수값 입력
		int point = sc.nextInt();
		
		
		if(point >= 60 ) {
			System.out.print("당신의 점수는 "+point+"점이기 때문에 합격입니다");
		} else
			System.out.print("당신의 점수는 "+point+"점이기 때문에 불합격입니다");
	
		
			sc.close();
}
}
