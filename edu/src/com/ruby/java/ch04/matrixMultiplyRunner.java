package com.ruby.java.ch04;

import java.util.Random;

public class matrixMultiplyRunner {

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
// A 출력 
		for(int i=0 ; i < A.length;i++) {
			for(int j = 0 ; j < A[i].length; j++) {

				System.out.print(A[i][j]);
				System.out.print("\t");
			}
			
			System.out.println();
		}

// 행렬 B 설정 및 난수 입력 
		int [][] B = new int [4][5];// 난수로 입력
		
		Random rand1 = new Random();
		for(int i=0; i < B.length; i++) {
			for(int j = 0 ; j < B[0].length;j++) {
				B[i][j] = rand1.nextInt(100);
		}
		}
// 행렬 B 출력
		for(int i=0 ; i < B.length;i++) {
			for(int j = 0 ; j < B[i].length; j++) {

				System.out.print(B[i][j]);
				System.out.print("\t");
			}
			
			System.out.println();
		}
// 행렬 C 설정 , 행렬 A * 행렬 B 메서스 생성
		int [][] C = multiplyMatrices(A,B);
// 행렬 C 출력 	
	for(int i =0; i < C.length; i++) {
		for(int j = 0 ; j < C[i].length; j++) {
			System.out.print(C[i][j] + " ");
		}
		System.out.println("\t");
	}
	}	

    /*
     * *
     * 두 행렬을 곱하는 메서드
     * @param A 첫 번째 행렬
     * @param B 두 번째 행렬
     * @return 결과 행렬 C
     */

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
		
		
		// 결과 행렬 반환 
		return result;
	}
	
}
