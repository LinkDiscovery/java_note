package com.ruby.java.ch04;

import java.util.Random;

public class Test38_2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = new int [3][4];// 난수로 입력
		
		Random rand = new Random();
		for(int i=0; i < A.length; i++) {
			for(int j = 0 ; j < A[0].length;j++) {
				A[i][j] = rand.nextInt(100);
			//System.out.println(A[i][j]);
			}
		}
		
		for(int i=0 ; i < A.length;i++) {
			for(int j = 0 ; j < A[i].length; j++) {

				System.out.print(A[i][j]);
				System.out.print("\t");
			}
			
			System.out.print("\n");
		}
		int B[][] = new int [4][5];// 난수로 입력
		Random rand1 = new Random();
		for(int i=0; i < B.length; i++) {
			for(int j = 0 ; j < B[0].length;j++) {
				B[i][j] = rand1.nextInt(100);
		}
		}
		for(int i=0 ; i < B.length;i++) {
			for(int j = 0 ; j < B[i].length; j++) {

				System.out.print(B[i][j]);
				System.out.print("\t");
			}
			
			System.out.print("\n");
		}
		
		int C[][] = multiplyMatrices(A,B);// 계산 결과
		
		for(int i=0 ; i < B.length;i++) {
			for(int j = 0 ; j < B[i].length; j++) {

				System.out.print(B[i][j]);
				System.out.print("\t");
			}
			
			System.out.print("\n");
		}
		int D[][] = new int [3][4];// 난수 입력
		
		Random rand3 = new Random();
		for(int i=0; i < D.length; i++) {
			for(int j = 0 ; j < D[0].length;j++) {
				D[i][j] = rand3.nextInt(100);
			//System.out.println(A[i][j]);
			}
		}
		
		for(int i=0 ; i < D.length;i++) {
			for(int j = 0 ; j < D[i].length; j++) {

				System.out.print(D[i][j]);
				System.out.print("\t");
			}
			
			System.out.print("\n");
		}
		
		//int E[][] = A[][]+D[][];// 행렬 더하기 
		
		
		int F[][] = new int [4][3];// 결과 
		//c = a*b; // 행렬 곱하기
		//e = a+d;  행렬 더하기
		//f = a의 전치 행렬 
	

}

	private static int[][] multiplyMatrices
	(int[][] A, int[][] B) {
		// TODO Auto-generated method stub
		return null;
	}
}