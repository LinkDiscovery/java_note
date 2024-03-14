package Chap2_기본자료구조;

import java.util.Arrays;

//구글링 : comparator, comparable 차이가 무엇인지 사용 예 파악 
//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData> {
	String name;
	int height;
	double vision;

	public PhyscData(String string, int i, double d) { //생성자
		this.name = string;
		this.height = i;
		this.vision = d;
	}

	@Override
	public String toString() {
		return String.format("{name=%s, height=%d, vision=%.1f}", name, height, vision);
	}

	@Override
	public int compareTo(PhyscData p) {
		if (this.height > p.height) {
			return 1;	
		} else if (this.height < p.height) {
			return -1;
		}else if(vision > p.vision){
			return 1;
		}else if(vision < p.vision) {
			return -1;
		}else if(name.compareTo(p.name)>0) {// 이렇게 한다면 무엇이 우선순위가 되는가 , 근데 위에서 아래로 진행되므로
			                                // 저기서 다끝남
			return 1;
		}else if(name.compareTo(p.name) < 0){
			return -1;
		}else { 
			return 0;
		}
			
//		return Integer.compare(this.height, p.height);
	}
		

	public boolean equals(PhyscData p) {
		
		if (this.compareTo(p) == 0) {
			return true;
		}
		return false;
	}
}
	public class Test_실습2_14객체배열정렬 {

		static void swap(PhyscData[] arr, int ind1, int ind2) {
			PhyscData temp = arr[ind1];
			arr[ind1] = arr[ind2];
			
			arr[ind2] = temp;
		}

		static void sortData(PhyscData[] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].compareTo(arr[j]) > 0) {
						swap(arr, i, j);
					}
				}
			}
		}

		public static void main(String[] args) {
			PhyscData[] data = { 
					new PhyscData("홍길동", 162, 0.3), 
					new PhyscData("홍동", 164, 1.3),
					new PhyscData("홍길", 152, 0.7), 
					new PhyscData("김홍길동", 172, 0.3), 
					new PhyscData("이길동", 182, 0.6),
					new PhyscData("박길동", 167, 0.2), 
					new PhyscData("최길동", 169, 0.5), 
				};
			
			showData(data);
			sortData(data);
//			Arrays.sort(null, null);//comparator가 필요하다
			showData(data);
			
		}

		static void showData(PhyscData[] arr) {
			for (PhyscData data : arr) {
				System.out.println(data);
			}
			System.out.println();
		}
	}

