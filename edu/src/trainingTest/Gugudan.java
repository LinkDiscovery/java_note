package trainingTest;

public class Gugudan {

	public void print(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	public void printVertical() {
		for (int i = 2; i <= 9; i++) {
			print(i); // 2단출력
			System.out.println("-".repeat(15));
		}
	}

	public void printHorizontal() {
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(i + " * " + j + " = " + (i * j) + " " + "\t");
			}
			System.out.print("\n");
		}
	}

	public void printColumn(int col) {

		int mok = (9 / col) + 1;
		for (int k = 0; k < mok; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= col + 1; j++) {
					int num = j + (col * k);
					if (num > 9) {
						break;
					}
					System.out.print(num + "*" + i + "=" + (i * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
//		int mok = 8 / col + 1;
//		int i = 2;
//		for (int j = 1 ; j <= mok  ; j++) {
//			for (i = 2 * j+1 ; i < (col + 2) * j ; i++) {
//				System.out.print(i + " * " + 1 + " = " + (i * 1) + " " + "\t");
//			}
//			System.out.println();

//	public void printColumn(int num) {
//
//		int result = 0;
//		// 제일 바깥쪽 순환은 i 인데 num 만큼 출력만 하게 만든다. i
//		for (int i = 2; i <= 9; i++) {
//			// 그 다음 순환은 안쪽에서 첫번재줄은 1, 두번째 줄은 2 로 증가하는 값 j
//			for (int j = 1; j < 10; j++) {
//				for (int k = 2; k <= 9; k++) {
//					result = k * j;
//					System.out.print(k + " * " + j + " = " + result + " " + "\t");
//				}
//				System.out.println("\n");
//			}
//		}
//
//		// 그 다음 순환은 k 2,3,4 로 증가하는 값 이게 끝나면 바깥쪽 for 로 가서 반복한다.
//
//	}
// 교수님 정답 
//	public void printColumn(int col) {
//		if (9 < col) {
//			System.out.println("col is not calid![1~9]");
//			return;
//		}
//		for (int i = 2; i < 10; i += col) {
//			for (int j = 1; j < 10; j++) {
//				for (int k = 0; k < col; k++) {
//
//					if (10 <= i + k) {
//						System.out.print("\n");
//						break;
//					}
//					System.out.printf("%d * %d = %d", (i + k), j, (i + k) * j);
//
//					if (k < col - 1)
//						System.out.print("\t");
//					else
//						System.out.print("\n");
//				}
//			}
//			System.out.println();
//		}
//	}
//}
