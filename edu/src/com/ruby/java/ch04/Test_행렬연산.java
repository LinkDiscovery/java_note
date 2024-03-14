package com.ruby.java.ch04;

import java.util.Random;

public class Test_행렬연산 {

	/*
	 * 행렬 덧셈, 곱셈 연산 메소드 정의
	 * 1차버젼: 덧셈후 바로 출력
	 * 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
	 */

	
	static void showMatrix(int [][] X) {
		for(int i =0; i < X.length;i++) {
			for(int j = 0 ; j < X[i].length; j++) {
				System.out.print(X[i][j] + " ");
			}
				System.out.println("\t");
				
				
				//2차원 모습으로 출력
	}
		System.out.println("End");
	}
	static void getData(int[][]a) {
		Random rs = new Random();
		for(int i = 0 ; i < a.length; i++) {
			for(int j =0; j < a[0].length; j++) {
				a[i][j] = rs.nextInt(10);
				
	}
}
}

	static int [][] addMatrix(int[][]B, int[][]C){
		int m[][];
		int r = B.length;
		int c = B[0].length;
		m= new int [r][c];
		for(int i = 0 ; i<r; i++) {
			for(int j = 0 ; j<c; j++) {
				m[i][j] = B[i][j]+C[i][j];

			}
		}
		return m;
	}
	
	static int [][] multiplyMatrix(int [][]B,int[][]E){
		int m = B.length;
		int n = B[0].length;
		int p = E.length;
		int [][]result = new int [m][p];
		for(int i= 0 ; i < m; i++) { 
			for( int j = 0; j < n ; j++) { 
				for( int k = 0 ; k < p ; k++ ) {
					result[i][k] += B[i][k]*E[k][p];
				}
			}
		}
		return result;
	}

	static int [][] transposeMatrix(int [][] B){
		int m = B.length;
		int n = B[0].length;
		int [][]result = new int [n][m];
		for(int i =0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j ++ ) {
				result[j][i] = B[i][j];
			}
		}
		return result;
		
		
		
	}
	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		int [][]A = new int [3][4];
		int [][]B = new int [3][4];
		int [][]C = new int [3][4];
		int [][]D = new int [3][5];
		int [][]E = new int [4][5];
		int [][]F = new int [4][3];
		// 난수 설정
		
		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		
		getData(B);
		getData(C);
		getData(E);

		A = addMatrix(B, C);
		showMatrix(A);
		showMatrix(B);
		showMatrix(C);

		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");

		D = multiplyMatrix(B,E);

		showMatrix(B);
		showMatrix(E);
		showMatrix(D);

		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = transposeMatrix(B);
		showMatrix(B);
		showMatrix(F);

	}
	

}

	
	

