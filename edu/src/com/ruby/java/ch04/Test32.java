package com.ruby.java.ch04;

public class Test32 {

	public static void main(String[] args) {
	
		int[] score;
		score = new int[]{90,85,78,100,98,30};
		
		int num = score.length;
		System.out.println("num = " + num);
		
		String str = "nice day";
		int num2 = str.length();
		System.out.println("num2 = " + num2);
		
		
			int[] arr = new int[5];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
			
			int num3 = arr.length;
			System.out.println(arr.length);
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			
			

	}

}
