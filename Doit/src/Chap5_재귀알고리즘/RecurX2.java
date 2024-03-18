package Chap5_재귀알고리즘;

import java.util.Scanner;

public class RecurX2 {

	static void recur(int n) {
		IntStack s = new IntStack(n);
//		while(n>0) { //if(n>0)
		while (true)
			if (n > 0) { // 체스판의 다음 행에  퀸을 배치할 수 있으면 
				s.push(n); // recur(n-1); 대신
				n = n - 1;
				continue;
			}
		if (s.isEmpty() != true) {
			n = s.pop;
			//pop()한 위치를 사용해서 다음 열을 조사하고 더 이상 없으면 이전 행으로 돌아가고
			System.out.println(n);
			n = n - 2;
			continue;
//			recur(n-1);
//			System.out.println(n); // n 값 출력 
//			n=n-2;//recur(n-2)
		} else
			break;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int x = stdIn.nextInt();

		recur(x);
	}
}
