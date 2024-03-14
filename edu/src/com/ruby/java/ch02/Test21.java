package com.ruby.java.ch02;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		
		
		Scanner scoreCase1 = new Scanner(System.in);
		System.out.print("A: ");
		int a = scoreCase1.nextInt();
		
		Scanner scoreCase2 = new Scanner(System.in);
		System.out.print("B: ");
		int b = scoreCase2.nextInt();
		
		Scanner scoreCase3 = new Scanner(System.in);
		System.out.print("부등호: ");
		int op = scoreCase3.nextInt();
		

		if(op=='+') {
			System.out.println(a+b);
		}else if(op =='-') {
			System.out.println(a-b);
		}else if(op=='*') {
			System.out.println(a*b);
		}else if(op=='/') {
			System.out.println(a/b);
		}
				
	}

}
