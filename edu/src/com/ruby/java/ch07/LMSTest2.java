package com.ruby.java.ch07;

public class LMSTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor p = new Professor("홍길동",40," 자바");
		//super(); 가 생략 되어있음 > 그러므로 부모의 생성자를 먼저 호출하는 결과값이 나옴
		Professor p1 = new Professor("신건영",33," 자바");

		
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");

	

		System.out.println(p.toString());
		System.out.println(p1.toString());
	}
	

}
