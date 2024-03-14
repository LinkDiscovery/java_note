package com.ruby.java.ch14.Ramda;


@FunctionalInterface 
interface Multiply{//@interface가 되면 왜 오류가 뜨는가?
	double getValue();
	
}

public class Test02 {
public static void main(String[] args) {
	
	Multiply m;
	m = ()->3.14*2;
	System.out.println(m.getValue());
	
	m = () -> 10*3;
	System.out.println(m.getValue());
}
}
