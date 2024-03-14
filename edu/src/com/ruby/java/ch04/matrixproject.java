package com.ruby.java.ch04;

import java.util.Random;

public class matrixproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] A = new int[3][4];
//행렬 A 설정 및 난수 입력 
		Random rand = new Random();
		for(int i=0; i < A.length; i++) {
			for(int j = 0 ; j < A[0].length;j++) {
				A[i][j] = rand.nextInt(100);
			//System.out.println(A[i][j]);
			}
		}

		int [][] B = new int [4][5];// 행렬 B 난수로 입력
		
		Random rand1 = new Random();
		for(int i=0; i < B.length; i++) {
			for(int j = 0 ; j < B[0].length;j++) {
				B[i][j] = rand1.nextInt(100);
		}
		}

		int [][] C = multiplyMatrices(A, B);

// 행렬 C 출력 	
	for(int i =0; i < C.length; i++) {
		for(int j = 0 ; j < C[i].length; j++) {
			System.out.print(C[i][j] + " ");
		}
		System.out.println("\t");
	}
	int [][] D = new int [3][4];// 난수로 입력
	
	Random rand3 = new Random();
	for(int i=0; i < D.length; i++) {
		for(int j = 0 ; j < D[0].length;j++) {
			D[i][j] = rand3.nextInt(100);
	}
	}
	int[][]E = new int[3][4];
	
	E = plusMatrix(A,D);
	
	for(int i =0; i < E.length; i++) {
		for(int j = 0 ; j < E[i].length; j++) {
			System.out.print(E[i][j] + " ");
		}
		System.out.println("\t");
	}

	int [][] F = tranferMatrix(A); 

	for(int i =0; i < F.length; i++) {
		for(int j = 0 ; j < F[0].length; j++) {
			System.out.print(F[i][j] + " ");
		}
	
		System.out.println();
	}
	}
	
	
	private static int[][] tranferMatrix(int [][] a ) {

		int m = a.length;// a 행의 길이
		int n = a[0].length; // b 행의 길이
		int [][]result = new int [n][m]; //초기화
		
		for(int i = 0; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) { 
				result[j][i] = a[i][j];
			}
		}

		return result;
	}



	private static int[][] plusMatrix(int[][] a, int[][] d) {
	
		int m = a.length;
		int n = a[0].length;
		int [][] result = new int [m][n] ;
		for(int i = 0; i < m;i++) {
			for(int j=0; j < n;j++) {
				result[i][j] = a[i][j]+d[i][j];
			}
		}
		return result;
	}

	private static int[][] multiplyMatrices(int[][] a, int[][] b) {

		// 행렬 A의 크기 
		int m = a.length;// 행의 크기
		int n = a[0].length; // 열의 크기 
		
		// 행렬 B의 크기 
		int p = b[0].length;// B의 열의 크

		//행렬 C의 초기화 
		int[][] result = new int[m][p];
		
		for(int i = 0; i < m ; i++) { // 행렬 A의 '행'만큼 반복 , a 행 고정 
			for(int j =0; j<p; j++) { // 행렬 B의 '열'만큼 반복 , b 열 고정 
				for(int k = 0; k<n; k++) { // 행렬 A의 '열'만큼 반복
					result[i][j] += a[i][k]*b[k][j];
					      
				}
			}
		}
		return result;
	}
	
}
