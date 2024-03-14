package com.ruby.java.ch13;

import java.util.Arrays;
import java.util.List;

public class WildCard {

	public static void main(String[] args) {
		Integer[] inum= {1,2,3,4,5};
		Double[] dnum= {1.0,2.0,3.0,4.0,5.0};
		String[] snum = { "1","2","3","4","5"};
		
		List<Integer> iList = Arrays.asList(inum);
		List<Double> dList = Arrays.asList(dnum);
		List<String> sList = Arrays.asList(snum);
		
		double isum = sum(iList);
		double dsum = sum(dList);
		// double ssum = sum(sList); //오류발생 
		System.out.println("inum의 합계 : " + isum);
		System.out.println("dnum의 합계 : " + dsum);
	}
									// Number라는 클래스에서 상속받은 List형태의 타입만 값으로 들어올수있다.라고 표현 
									// 그래서 문자열로 된 타입은 처리가 안된다. 그래서 sum(slist) 오류 발생함
	public static double sum(List<? extends Number> list) {
		double total = 0 ; 
		for ( Number v : list) {
			total += v.doubleValue();
		}
	return total;
}
}
