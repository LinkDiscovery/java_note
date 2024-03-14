package com.ruby.java.ch09.기본API;



import java.util.Arrays;

public class Test16_Arrays {

	public static void main(String[] args) {
		int score[] = { 85, 90, 95, 100, 75 };
		int score2[] = Arrays.copyOf(score, score.length); // 배열 통째로 복사하는 것 
		int score3[] = Arrays.copyOfRange(score, 3, 5); // 배열 일부를 복제하고 싶을 때

		int score4[] = new int[score.length];
		System.arraycopy(score, 0, score4, 0, score.length);

		System.out.println(Arrays.toString(score));// score 객체 배열을 스트링으로 바꿈 , toString를 안쓰고 score만 쓰면 주소를 찍어줌
													// 배열을 찍으려면 Arrys.toString() 를 사용하면 된다.
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score3));
		System.out.println(Arrays.toString(score4));

		System.out.println(Arrays.equals(score, score2));// 두 배열 비교하는 메서드도 Arrays메서드에서 제공한다.

		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.equals(score, score2));

		int index = Arrays.binarySearch(score, 100);
		System.out.println(index);
	}
}