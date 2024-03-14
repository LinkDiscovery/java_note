package com.ruby.java.ch02;

import java.util.Scanner;

public class Test30_2 {

	public static void main(String[] args) {

		int num = 7 ; 
		boolean flag = false;
		for(int i = 2; i<num ; i++) {
			if(num%i == 0 ) {
				flag = true;
				break;
			}
		}
		System.out.println(flag?"소수가 아닙니다.": "소수입니다");
			}
		}

// 값을 넣고 
// 그 값에 대해서 , 그 앞의 수 전체를 차례로 나눈다. 
// 만약에 그 앞의 수 전체가 나눠지지 않는다면 
// 그 값은 소수다.

//	int i =2;
//	for(i=2; i<num; i++) {
//	if(num%i==0) break;
//	System.out.println( i<num ?"소수가 아닙니다.":"소수입니다.");


