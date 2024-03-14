package trainingTest;

public class MatrixMultiply {

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
		
		
		}

	private static int[][] multiplyMatrix(int[][] mA, int[][] mB) {
			int m = mA.length;
			int n = mA[0].length;
			int p = mB[0].length;

			int [][]result = new int [m][p];
			
			for(int i = 0 ; i < m; i++) {
				for(int j= 0 ; j < p; j++) {
					result[i][j] = 0;
					for(int k = 0 ; k < n; k++) {
						result[i][j] += mA[i][k]*mB[k][j];
					}
				}
			}
		return result;
	}
	}

