package com.ruby.java.ch04;

import java.util.Random;

public class matrix {

	public static void main(String[] args) {
	
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
		
		int [][]B = transfermatrix(A);
		
		for(int i=0 ; i < B.length;i++) {
			for(int j = 0 ; j < B[i].length; j++) {

				System.out.print(B[i][j]);
				
				System.out.print("\t");
			}
			
			System.out.println();
		}
		
		
}

	private static int[][] transfermatrix(int [][] a) {
		int m = a.length;
		int n = a[0].length;
		int [][] result = new int[n][m];
			for(int i = 0 ; i < m ; i++) {
				for(int j = 0 ; j < n; j ++) {
					result[j][i] = a[i][j];
				}
			}
				return result;
	}
}
