package trainingTest;

public class MatrixMultiply1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// [3][4] * [4][3]
		int [][]mA = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int [][]mB = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		
		int [][] C = multiplyMatrix(mA,mB);
		
		//출력 
		String sr = "int";
		sr.length();
		
		for(int i =0; i < C.length ; i++) {
			for(int j = 0 ; j < C[i].length; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println("\t");
		}
		}
// 연산 
	private static int[][] multiplyMatrix(int[][] mA, int[][] mB) {
			int m = mA.length;
			int n = mA[0].length;
			int p = mB[0].length;

			int [][]result = new int [m][p];

			for(int i = 0 ; i < m; i++) {
				for(int j= 0 ; j < p; j++) { 
					for(int k = 0 ; k < n; k++) {
						result[i][j] += mA[i][k]*mB[k][j];
					}
				}
			}
		return result;
	}
	}

