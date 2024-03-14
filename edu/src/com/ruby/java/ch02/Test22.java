package com.ruby.java.ch02;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scoreCase1 = new Scanner(System.in);

		System.out.print("A: ");
		int a = scoreCase1.nextInt();

		System.out.print("B: ");
		int b = scoreCase1.nextInt();

		System.out.print("부등호: ");
	
		char op = scoreCase1.next().charAt(0);
		
		switch(op){
			case '+' :
				System.out.println(a+b); break;
			case '-' :
				System.out.println(a-b); break;
			case '*' :
				System.out.println(a*b); break;
			case '/' :
				System.out.println(a/b); break;
		}
		
	}

}
