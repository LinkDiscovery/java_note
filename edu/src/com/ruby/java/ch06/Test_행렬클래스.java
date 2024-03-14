package com.ruby.java.ch06;

import java.util.Random;

/*
 * 클래스 메소드 구현 실습 목적
 */
class Matrix {
	int rows;
	int cols;
	int[]data;

	public Matrix(int rows, int cols) {  
		this.rows = rows; this.cols = cols;
		data = new int[rows * cols];// B는 [12] 로 설정됨 즉, 1행 12열로 구성된 행렬이 만들어짐
	}

	void getData() {
		Random ran = new Random();
		for(int i = 0 ; i < this.rows*this.cols; i++) {
				data[i] = ran.nextInt(10);

				// 난수로 입력
				
	}
}

	Matrix addMatrix(Matrix c) {
		Matrix b = new Matrix(this.rows, this.cols);

		if (this.rows != c.rows || this.cols != c.cols) {
			    throw new IllegalArgumentException("행렬의 차원이 일치해야 합니다.");
			}

		 for (int i = 0; i < this.rows * this.cols; i++) {
	            b.data[i] = this.data[i] + c.data[i];
	          
	            // A = B.addMatrix(C)
		// B행렬과 C행렬의 i, j 가 같다면 그 행을 합치고, 다르면 합치지 않는다.
		// 행렬 B = {1,2,3,4,5,6,7,8} B.data > 행렬 호출 
		// 행렬 C = {1,2,3,4,5,5,6,7}
	}
			return b ; 
	}
	
	Matrix multiplyMatrix(Matrix b) {
		Matrix m = new Matrix(this.rows, b.cols);
		if (this.cols != b.rows) {
            throw new IllegalArgumentException("행렬 곱셈의 조건을 만족하지 않습니다.");
        }
      
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < b.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                	m.data[i * m.cols + j] += this.data[i * this.cols + k] * b.data[k * b.cols + j];
                }
               
            }
        }
		return m;	
	}
	
	Matrix transposeMatrix() {
		Matrix m = new Matrix(this.cols, this.rows);

		for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                m.data[j * m.cols + i] = this.data[i * this.cols + j];
            }
        }
		return m;
	}
	
	void showMatrix(String str) {
		
		System.out.println(str);

		for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.data[i * this.cols + j] + " ");
            }
            System.out.println();
        }
        System.out.println();
		//2차원 배열 모양으로 출력하는 코드 작성
	}
}
public class Test_행렬클래스 {

	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		Matrix B = new Matrix(3,4);//matrix 의 인스턴스를 만들었다. matrix라는 객체가 있고 그 객체는 행동은 안에 메서드로 정의 되어 짐. 
		Matrix C = new Matrix(3,4);// 
		Matrix A, D, F;
		Matrix E = new Matrix(4,5);

		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		B.getData();
		C.getData();
		E.getData();
		
		A = B.addMatrix(C);
		B.showMatrix("B[3][4]");
		C.showMatrix("C[3][4]");
		A.showMatrix("A[3][4]");
		
		
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = B.multiplyMatrix(E);
		B.showMatrix("B[3][4]");
		E.showMatrix("E[4][5]");
		D.showMatrix("D[3][5]");
		
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = B.transposeMatrix();
		B.showMatrix("B[3][4]"); F.showMatrix("F[4][3]");

	}

}
