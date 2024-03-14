package Chap3_검색;

/*
 * Comparable 구현 //123p
 */
/*
 * 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
 * 함수(메소드) 전체를 작성하는 훈련 
 */
import java.util.Arrays;

public class train_실습3_6_1객체배열이진탐색 {


	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("나동", 164, 1.3),
				new PhyscData2("최길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("박동", 182, 0.6),
				new PhyscData2("이동", 167, 0.2),
				new PhyscData2("길동", 167, 0.5),
		};
//		if (data[0].compareTo(data[1])>0)
//			System.out.println();
		
		showData("정렬전", data);
		sortData(data);
		showData("정렬후", data);
		reverse(data);
		showData("역순 재배치후", data);
		Arrays.sort(data);//사용된다 그 이유는? 내가 정의한 compareTo를 활용하여 정렬된다.** 중요 내가 시력가지고 정렬하면 시력으로 정렬되고
		                  // 키로 정렬하면 키로 정렬된다.
		showData("Arrays.sort() 정렬후", data);
		
		PhyscData2 key = new PhyscData2("길동", 167, 0.5);
		int resultIndex = linearSearch(data, key);
		System.out.println("\nlinearSearch(<길동,167,0.2>): result = " + resultIndex);
		
		key = new PhyscData2("박동", 182, 0.6);
		/*
		 * 교재 109~113
		 */
		resultIndex = binarySearch(data, key);//comparable를 사용
		               // 내가 만든 메서드
		System.out.println("\nbinarySearch(<박동,182,0.6>): result = " + resultIndex);
		key = new PhyscData2("이동", 167, 0.6);
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		resultIndex = Arrays.binarySearch(data, key);//comparable를 사용
		                    //arrays에서 제공하는 메서드이지만 내가 정의한 메서드를 사용한다. 이건 data, key 객체가 존재하는 클래스에서 
		                    //메서드를 가져다 써서 그런듯 하다
		System.out.println("\nArrays.binarySearch(<이동,167,0.6>): result = " + resultIndex);
	}
	
	
	//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
	static class PhyscData2 implements Comparable<PhyscData2>{ //Comparable<PhyscData2> 정확히 기억할 것 ,제네럴임 
														// 통일된 인터페이스를 제공한다. 메서드 정의를 따로 그냥하면되는데 왜 인터페이스를 써야하느냐?
	// PhyscData2 에 해당하는 클래스를 static으로 선언해줘야한다고 하는데 왜 그렇지?
		String name;
		int height;
		double vision;
		
		
		 public PhyscData2(String name, int i, double vision) {
			this.name = name;	
			this.height = i;
			this.vision = vision;
		}
		

		@Override
		 public String toString() {
			return "[ "+name+" , "+height+" , "+vision+" ]";
			
		}
		@Override
		 public int compareTo(PhyscData2 p) { // compareTo가 내부 객체가 아니라는 것을 잘 기억해야한다.
			if (vision > p.vision)
				return 1;
			else if (vision < p.vision)
				return -1;
			else 
				return 0;
		}
		
		 public int equals(PhyscData2 p) {
			if (this.name != p.name ) {
				return -1;
			}
				return 1;
		}
	}
	
	
	 private static void showData(String string, PhyscData2[] data) {
		for( PhyscData2 arr : data) { // 여기서 왜 데이터 타입 PhyscData2 를 써줘야 하지? 원래 타입 써줘야함
			System.out.println(arr + " ");
			
		}
		System.out.println();
	}


	private static void sortData(PhyscData2[] data) {
		// 확장형 for 문은 부적합
		// 확장형 for문은 인덱스가 없어서 swap()처리 안됌
		
//		Arrays.binarySearch(null, 0, 0, null, null);
		for(int i = 0; i < data.length; i++) {
			for(int j = i+1 ; j <data.length; j++) {
				if(data[i].compareTo(data[j])>0){
					swap(data,i,j);
				}
			}
		}
	}
	
	private static void swap(PhyscData2[] data, int i, int j) {
	
		 PhyscData2 temp = data[i]; //** 중요 나는 PhyscData2 [] temp = PhyscData2[i] 이런식으로 썼음
		 data[i] = data[j];
		 data[j]=temp;
		 
		
	}

	


	private static int binarySearch(PhyscData2[] data, PhyscData2 key) {

		int pl = 0;
		int pr = data.length - 1;

		do {
			int pc = (pl + pr) / 2;
			if (data[pc].compareTo(key) == 0)
				return pc ;
			else if (data[pc].compareTo(key) < 0)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);

		return -1;
	}

	private static int linearSearch(PhyscData2[] data, PhyscData2 key) {
		int i = 0;

		while (i < data.length) {
			if (key.compareTo(data[i])==0) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}

	private static void reverse(PhyscData2[] data) {
		for (int i = 0; i < data.length / 2; i++)
			swap(data, i, data.length - i - 1);

	}
}


