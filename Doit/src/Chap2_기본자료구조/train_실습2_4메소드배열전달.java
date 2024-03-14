 package Chap2_기본자료구조;

//메소드에 배열 전달 실습부터
//실습 설명한다 
//매개변수로 배열 전달
import java.util.Random;

public class train_실습2_4메소드배열전달 {

	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		showData(data);
		int max = findMax(data);
		findValue(data, 23);
		System.out.println("\nmax = " + max);

	}
	static void showData(int[]data) {
		for (int num: data) { //확장형 for 문
			System.out.print(num+" ");
		}
	}
	public static void inputData(int []data) {//교재 63 - 난수의 생성
		Random rand = new Random(); // 의미 얘의 정체는 뭘까 조금 더 개발자적? 교수님적? 
		for(int i=0; i < data.length;i++) {
			data[i] = rand.nextInt(30);
		}
		
		
		
	}
	static int findMax(int []items) {

		int max = items[0];
		
		for(int i=0; i < items.length;i++ ) {
			if(max < items[i]) {
				max = items[i];
			}
		}
		return max;
	}
	
	static boolean findValue(int []items, int value) {
		//items[]에 value 값이 있는지를 찾는 알고리즘 구현
		for (int i = 0 ; i < items.length; i++) {
			if(value == items[i]) {
				return true;
			}
		}
		return false;
	}// return값은 내가 어떤 값을 반환하고 싶은지 그 갯수만큼 정하면된다.
}
