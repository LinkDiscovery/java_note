package trainingTest;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		// 데이터 입력 하게끔 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값:");
		int num = sc.nextInt();
		sc.close();

		int s = (int) Math.pow(10.0, (double) (num - 1));
		int e = (int) Math.pow(10.0, (num)) - 1;
		for(int i=s; i<=e; i++) 
			findPrimeNumber(i);
	}
	private static void findPrimeNumber(int num) {

	
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("소수아니다");
				break;
			} else
				System.out.println("소수다");
			
		}

	}
}

