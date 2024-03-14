package com.ruby.java.ch04;

public class Test35 {

	public static void main(String[] args) {
	
		int[]arr = {10,20,30,40,50};
		String[] st = {"apple", "banana"};
		
		for(int num : arr) {
			System.out.println(num+"\n");
		
		for(String stx :st) {
			System.out.println(stx+"\n");	
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
			//간결한 코딩 - 배열원소 전부 출력 + 인덱스 사용이 필요하지 않을 때 
		}
		
		
	}

}
}
}