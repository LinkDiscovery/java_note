package Chap3_검색;

import java.util.Arrays;
import java.util.Comparator;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData3 { public PhyscData3(String string, int i, double d) {
		name = string;
		height = i;
		vision = d;
	
		
	}
@Override
public String toString() {
	return "PhyscData3 [name=" + name + ", height=" + height + ", vision=" + vision +"]";
}
	// 우리가 만드는 클래스
	String name;
	int height;
	double vision;

}

class HeightOrderComparator2 implements Comparator<PhyscData3>{ //compare만 구현한 메서드만 존재하는 클래스

	@Override
	public int compare(PhyscData3 o1, PhyscData3 o2) {
	   // compare(T a1, T a2) a1과 a2를 비교한다. 124page	
	
		if(o1.name.compareTo(o2.name)>0) 
			return 1;
			
		else if (o1.name.compareTo(o2.name)<0) { 
			return -1;
		}else {
			return 0;
		}
	}

}
public class Test_과제2_3_8_객체비교연산자 {	
	static final Comparator<PhyscData3> HEIGHT_ORDER = new HeightOrderComparator2();
		

	public static void main(String[] args) {
		PhyscData3[] data = {
				new PhyscData3("홍길동", 162, 0.3),
				new PhyscData3("홍동", 164, 1.3),
				new PhyscData3("홍길", 152, 0.7),
				new PhyscData3("김홍길동", 172, 0.3),
				new PhyscData3("길동", 182, 0.6),
				new PhyscData3("길동", 167, 0.2),
				new PhyscData3("길동", 167, 0.5),
		};
		
	
		PhyscData3 key = new PhyscData3("길동", 167, 0.2);
		int result = Arrays.binarySearch(data,key, new HeightOrderComparator2());
		showData("정렬전 객체 배열", data);
		Arrays.sort(data, HEIGHT_ORDER);
		showData("정렬후 객체 배열", data);
		
		
		int idx = Arrays.binarySearch(data, key, HEIGHT_ORDER); // 129page // 객체를 던져준다 HEIGHT_ORDER
		System.out.println("\nArrays.binarySearch(): result = " + idx);
	}

	private static void showData(String string, PhyscData3[] data) {
		System.out.println(string);
		for (PhyscData3 arr : data) {
			System.out.println(arr+ " ");
		}
		System.out.println();
	}

}
// data. 찍어도 참조변수 이므로 뭐 나오는게 없음 
// Arrays.binary
















