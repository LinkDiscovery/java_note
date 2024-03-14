package Chap3_검색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class train_스트링리스트정렬 {

	public static String[] removeElement1(String[] arr, String item) {
		// 현재 배열에서 중복 제거할려면 코드가 길어진다. >배열에서 중복을 제거하려면 앞으로 다 당겨야함 >리스트에서 remove는 간단함
		// 배열을 리스트로 변환 > list.remove(); 를 사용하면
//		list.remove(item);
//		return list.toArray(String[]::new); //String[]::new > 메소드 레퍼런스다. 스트링 배열을 만드는 메소드이다. 스트링 배열을 생성한다.
		                                    // 람다식에 : 함수형 인터페이스 
		
		List<String> RemoveEle = new ArrayList<>(Arrays.asList(arr));
		
		int count = Collections.frequency(RemoveEle, item);
		// RemoveEle 안에 item 의 갯수를 알려주는 Collections 메서드 frequency
		
		
		RemoveEle.remove(item);
		// 삭제된 리스트를 배열로 변환해여 리턴
		return RemoveEle.toArray(new String[0]);
	}

	static String[] removeDuplicateList(List<String> list) {
		// 리스트를 배열로 변환 한다음에 배열에서 중복을 찾는다.
		//
		String cities[] = new String[0];
		cities = list.toArray(cities);

		// list를 배열 cities[]로 변환
		// for 문으로 도시가 중복인 것을 체크 = comepareTo를 사용해서
		for (int i = 0; i < cities.length; i++) {
			int j = i + 1;
			while (j < cities.length) {
				if (cities[i].compareTo(cities[j]) == 0) { // 배열에서 중복 검사하여 참이면
					cities = removeElement1(cities, cities[i]);
				}
			j++; // 이게 왜 있어야 하지? 아 이거 for 문 아니구나 while문이라서 그렇구나 ~ 

		}
//		    removeElement1(cities, city); // 배열에서 중복 제거를 위해 배열 전달 /
	}
	return cities;

	}
	
	static void getList(List<String> list) {
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");

		list.add(1, "LA");
	}

	static void showList(String topic, List<String> list) {
		System.out.println(topic + " ::");
		for (String st : list) {
			System.out.print(st + " ");
		}
	}

	static void sortList(List<String> list) {
		
		// 방법 1 : list.sort(null)
	    	list.sort(null);
	    //List 객체로서 List 함수들을 호출한다.
		// 방법 2 : 리스트를 스트링 배열로 전환 > Arrays.sort
		//List에 toArray 메소드가 존재
		
		String []AL = list.toArray(new String[0]);		
	    showArray(AL);
		
		
	}



	private static void showArray(String[] aL) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); // list가 만들어짐
		getList(list);
		showList("입력후", list);
		// sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩

//		    Collections.sort(list);

//배열의 정렬
		sortList(list);
		System.out.println();
		showList("정렬후", list);
// 배열에서 중복제거
		System.out.println();
		System.out.println("중복제거::");

		String[] cities = removeDuplicateList(list);
		ArrayList<String> lst = new ArrayList<>(Arrays.asList(cities)); // 배열을 다시 리스트로 만들어주는 것을 asList()함수
		showList("중복제거후", lst);
	}
}
