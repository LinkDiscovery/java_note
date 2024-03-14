package Chap2_기본자료구조;

public class Test_실습2_14스트링배열정렬 {
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};
		//아스키코드로 실행, 유니코드
		showData(data);
		sortData(data);
		showData(data);
	}
	static void showData(String[]arr) {
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void swap(String[]arr, int ind1, int ind2) {
		
		String temp= arr[ind1];;
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;

	}
	static void sortData(String []arr) {
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i+1 ; j <arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) { //compareTo()사용하는 것, 구글링이나 챗봇 활용해서 하기 ,
					swap(arr,i,j);
				}
			}
		}
			
	}
}
