package Chap2_기본자료구조;

import java.util.Arrays;
//교재 67 - 실습 2-5
//2번 실습
// 배열은 전달하는 것과 정렬하는 것에 대한 이해하기
import java.util.Random;

public class train_실습2_5정수배열정렬 {

	public static void main(String[] args) {
		int[] data = new int[10];
		inputData(data);
		showData(data);

		sortData(data);
		showData(data);

		reverse(data);// 역순으로 재배치 - 정렬 아님
		showData(data); // 정렬 프로그램을 실제로 한번 해보세요

		reverseSort(data);// 역순으로 재배치 - 정렬 아님
		showData(data);

		Arrays.sort(data); // 자바 라이브러리를 활용한 정렬
	}

	static void showData(int[] data) {
		for (int num : data) {
			System.out.print(num + " ");
		}
		System.out.println("\n");

	}

	static void inputData(int[] data) { // 난수 생성해서 데이터 입력
		Random rand = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(30) + 1;
		}

	}

	static void swap(int[] arr, int ind1, int ind2) {// 교재 67페이지
		int temp;
		temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;

	}

	static void sortData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])
					swap(arr, i, j);
			}
		}
	}

	static void reverse(int[] a) {// 교재 67페이지
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	static void reverseSort(int[] arr) { // 내림차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j])
					swap(arr, i, j);
			}

		}

	}
}
