package Chap5_재귀알고리즘;

import java.util.Scanner;

public class RecurX1 {
	
	static void recur(int n ) {
		while(n>0) { //if(n>0)
			recur(n-1);
			System.out.println(n); // n 값 출력 
			n=n-2;//recur(n-2)
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:"
				+ " ");
		int x = stdIn.nextInt();
		
		recur(x);
	}
}
