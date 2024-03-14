package com.ruby.java.ch02;

import java.util.Scanner;

public class Test25 {
public static void main(String[] args) {
	
	
	Scanner scoreCase1 = new Scanner(System.in);
	System.out.print("num: ");
	int num = scoreCase1.nextInt(); // nextin 숫자를 받으려고 대기 중
	
	
	
	int sum1 = 0; // 홀수 합
	int sum2 = 0; // 짝수 합
	for (int i = 0; i<num ; i++) {
		if(i%2==0) {
			sum2 += i; 				//짝수
			System.out.println(">e:"+ sum2);
		}else {
			sum1 += i;				//홀수
			System.out.println(">o:"+sum1);
		}

		}
	System.out.println("ok:"+sum1+","+sum2);
	}
}
