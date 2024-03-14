package trainingTest;

import java.util.Scanner;


public class Test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 값 : ");
		int num = sc.nextInt();
		
		int i;
		int j;
		int k;
		int shin = 0;
		
		for(i=1;i<11;i++) {
			for(j=1;j<11;j++)
				for(k=1;k<11;k++) {
					if(calc(i,j,k) == num) {
						System.out.print("("+i+",");
						System.out.print(""+j+",");
						System.out.print(""+k+")");
						shin++;
					
					
				}
				
		}
		

	}
		System.out.println("count: "+shin);
	}

	private static int calc(int a,int b , int c) {
		// TODO Auto-generated method stub
		return 2*a+3*b+5*c;
	}
}
	
	
// 값 num 을 받는다. 
// 2g*x + 3g*y + 5g*z = num 가 같은 값을 모두 출력 해야한다.
// 