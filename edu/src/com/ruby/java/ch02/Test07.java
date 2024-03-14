package com.ruby.java.ch02;

public class Test07 {
public static void main(String[] args) {
	boolean isOn = false;
	while(!isOn) {
	// 반복 실행
	}

	short e = 10;
	int f = -e;

	int a = 10;
	int b=-1,c = 0;
	c= -b;
	System.out.println(c);
	b = ++a ;
	c = a++ ;
	System.out.println("b= "+b +", c="+c);
	System.out.println("a= " + a);
	boolean result = (b==c);
	System.out.println("result = " + result);
	
	
	System.out.println(a>b);
	
}
}
