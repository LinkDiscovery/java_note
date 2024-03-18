
package Chap4_스택과큐;
//List를 사용한 선형 큐 구현  - 큐는 배열 사용한다 
import java.util.Random;
import java.util.Scanner;

/*
* Queue of ArrayList of Point
*/

class Point3 {
	private int ix;
	private int iy;

	public Point3(int x, int y) {
		ix = x;
		iy = y;
	}

	@Override
	public String toString() {
		return "<" + ix + ", " + iy + ">";
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}

	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}
	@Override
	public boolean equals(Object p) {
		if ((this.ix == ((Point3)p).ix) && (this.iy == ((Point3)p).iy))
			return true;
		else return false;
	}
}

//int형 고정 길이 큐
class objectQueue2 {
  private Point3[] que; // que는 참조변수
	private int capacity; // 큐의 크기
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서
//	private int num; // 현재 데이터 개수 num 쓰지말고 하기 

	public objectQueue2(int maxlen) { // 배열의 크기만 받는 것 
		que = new Point3[maxlen]; // 또 new를 사용해서 공간할당을 또 한다. 
		capacity = maxlen; //필드변수와 메서드에서 값을 받는 변수명이 다르면 this 안써도 됨 
		front = rear = 0;
//		num = 0 ; 
	}
//--- 실행시 예외: 큐가 비어있음 ---// // 교수님이 지웠는데 직접보고 타이핑할 것 . 보고해도 괜찮음 외울필요는 없고 이해하기 

	public class EmptyQueueException extends RuntimeException {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public EmptyQueueException() {
			System.out.println("큐가 비었습니다.");
		}
		
	}
//--- 실행시 예외: 큐가 가득 찼음 ---//
	public class OverflowQueueException extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public OverflowQueueException() {
			System.out.println("큐가 꽉 찼습니다.");
		}
		
	}

//--- 생성자(constructor) ---//

    


//--- 큐에 데이터를 인큐 ---//
	public int enque(Point3 x) throws OverflowQueueException {
		if (isFull()) 
			throw new OverflowQueueException();
		que[rear++] = x;
		
		return rear-1;
	}

//--- 큐에서 데이터를 디큐 ---//
	public Point3 deque() throws EmptyQueueException {

	}

//--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
	public Point3 peek() throws EmptyQueueException {

	}

//--- 큐를 비움 ---peek처럼 구현//

//--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
	public int indexOf(Point3 x) {
		for (int i = 0; i < rear; i++) {
			int idx = (i + front) % capacity;
			if (que[idx].equals(x)) // 검색 성공
				return idx;
		}
		return -1; // 검색 실패
	}

//--- 큐의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
	public int size() {

			return rear-front;

		
	
	}

//--- 큐가 비어있는가? ---//
	public boolean isEmpty() {
		return rear-front <= capacity;
//		return num <= 0; num 쓰지말고 할것 isfull, isempty 사용 
	}

//--- 큐가 가득 찼는가? ---//
	public boolean isFull() {
		return rear >= capacity;
	}

//--- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//

}
public class 실습4_4객체선형큐_배열 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		objectQueue2 oq = new objectQueue2(4); // 최대 64개를 인큐할 수 있는 큐
		Random random = new Random();
		int rndx = 0, rndy = 0;
		Point3 p = null;
		while (true) {
			System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", oq.size(), oq.getCapacity());
			System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(5)clear  (0)종료: ");
			int menu = stdIn.nextInt();
			switch (menu) {
			case 1: // 인큐

				rndx = random.nextInt(20);

				rndy = random.nextInt(20);
				System.out.print("입력데이터: (" + rndx + ", " + rndy + ")");
				p = new Point3(rndx,rndy);
				try {
					oq.enque(p);
				} catch(objectQueue2.OverflowQueueException e) {
					System.out.println("queue이 가득찼있습니다.");
				}
				break;

			case 2: // 디큐
				try {
					p = oq.deque();
					System.out.println("디큐한 데이터는 " + p + "입니다.");
				} catch (objectQueue2.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = oq.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				} catch (objectQueue2.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 4: // 덤프
	
				break;
			case 5: //clear
		
				break;
			default:
				break;
			}
		}
	}
}
