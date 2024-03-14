package Chap3_검색;

/*
 * 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
 * 함수(메소드) 전체를 작성하는 훈련 
 */
import java.util.Arrays;
import java.util.List;
public class Test_과제1_스트링배열합병 {
    static void showList(String topic, String [] list) {

    }
    static String[] mergeList(String[]s1, String[] s2) { // 함수의 리턴타입은 String[] 이렇게 설정하는걸 숙달해야한다.
    	int i = 0, j = 0,k =0;
    	String[] s3 = new String[10];
    	
    	return s3;
    }
    public static void main(String[] args) {
	String[] s1 = { "홍길동", "강감찬", "을지문덕", "계백", "김유신" };
	String[] s2 = {"독도", "울릉도", "한산도", "영도", "우도"};
	Arrays.sort(s1);// comparable을 쓸까? comparator을 쓸까? > comparable의 compareTo()를 사용
	Arrays.sort(s2);
	//후속 코딩은 객체들의 정렬: Studens 클래스를 만들고 정렬 
	
	
	showList("s1배열 = ", s1);
	showList("s2배열 = ", s2);

	String[] s3 = mergeList(s1,s2);
	showList("스트링 배열 s3 = s1 + s2:: ", s3);
}
}
// 두 배열을 합쳐서 가나다 순으로 정렬된 새로운 배열 만들기. 
//while로 돌아야한다. for / while 쓸지 항상 생각하고 while로 조건 충족 할떄 까지 돌도록 만들어야함
//merge 해서 while 사용
// merge 하고 while 문 빠져 나왔을 때 또 while 사용해서 남아있는 q가 있는지 확인해야한다.
//p는 첫번째 배열 q는 두번째 배열 