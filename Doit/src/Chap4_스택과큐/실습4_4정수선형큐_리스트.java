package Chap4_스택과큐;

//선형 큐 구현
import java.util.Scanner;

import Chap4_스택과큐.IntStack4.EmptyIntStackException;

/*
 * Queue of ArrayList
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//int형 고정 길이 큐

class Queue4 {
	private List<Integer> que;// 원형큐로 구현하지 않는다
	private int capacity; // 큐의 크기
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서
//	private int num; // 현재 데이터 개수

//--- 실행시 예외: 큐가 비어있음 ---//
	public class EmptyIntQueue3Exception extends RuntimeException {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;

		public EmptyIntQueue3Exception() {
			System.out.println("Queue가 비었다");
		}
	}

//--- 실행시 예외: 큐가 가득 찼음 ---//
	public class OverflowQueueException extends RuntimeException {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;

		public OverflowQueueException() {
			System.out.println("Queue가 꽉 찾음");
		}
	}

//--- 생성자(constructor) ---//
	public Queue4(int maxlen) {
		capacity = maxlen;
		front = rear = 0;
		try {
			que = new ArrayList<Integer>();
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

//--- 큐에 데이터를 인큐 ---//
	public int enque(int x) throws OverflowQueueException {
		if (isFull())
			throw new OverflowQueueException();
		que.add(x);
		rear++;
		return x;
	}

//--- 큐에서 데이터를 디큐 ---//
	public int deque() throws EmptyIntQueue3Exception {
		if (isEmpty())
			throw new EmptyIntQueue3Exception();
		int x = que.remove(front); //
//		front++; list 니깐 값을 삭제하면 알아서 당겨지기때문에 front를 하면 안된다. 대신 rear--
		rear--;
		return x;
	}

//--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
	public int peek() throws EmptyIntQueue3Exception {
		if (isEmpty())
			throw new EmptyIntQueue3Exception();

		return que.get(front);

	}
	
	public void dump() throws EmptyIntQueue3Exception{
		if(isEmpty())
			throw new EmptyIntQueue3Exception();
		for (int i=0; i < que.size(); i++) {
			System.out.println(que.get(i));
		}
	}
	
	
	
//--- 큐를 비움 --- peek() 처럼 예외 발생 구현//
	public void clear() throws EmptyIntQueue3Exception {
		/*
		 * queue을 empty로 만들어야 한다. queue이 empty일 때 clear()가 호출된 예외 발생해야 한다
		 */
		if (isEmpty()) // queue이 빔
			throw new EmptyIntQueue3Exception();
		for (int i=0; i < que.size(); i++) {//while 로 해야되네
			int x = que.remove(i);
		}
		front = rear = 0;
	}

//--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
	public int indexOf(int x) {
		for (int i = 0; i < rear - front; i++) {
			int idx = (i + front) % capacity;
			if (que.get(idx) == x) // 검색 성공
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
		return rear - front;
	}

//--- 큐가 비어있는가? ---//
	public boolean isEmpty() {
		return rear - front <= 0;
	}

//--- 큐가 가득 찼는가? ---//
	public boolean isFull() {
		return rear >= capacity;
	}

}

public class 실습4_4정수선형큐_리스트 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Queue4 oq = new Queue4(4); // 최대 64개를 인큐할 수 있는 큐
		Random random = new Random();
		int rndx = 0, p = 0;
		while (true) {
			System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", oq.size(), oq.getCapacity());
			System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(5)clear  (0)종료: ");
			int menu = stdIn.nextInt();
			switch (menu) {
			case 1: // 인큐
				rndx = random.nextInt(20);
				System.out.print("입력데이터: (" + rndx + ")");
				try {
					oq.enque(rndx);
				} catch (Queue4.OverflowQueueException e) {
					System.out.println("queue이 가득찼있습니다.");
				}
				break;

			case 2: // 디큐
				try {
					p = oq.deque();
					System.out.println("디큐한 데이터는 " + p + "입니다.");
				} catch (Queue4.EmptyIntQueue3Exception e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = oq.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				} catch (Queue4.EmptyIntQueue3Exception e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 4: // 덤프
				try {
					oq.dump();
					System.out.println();
				}catch(Queue4.EmptyIntQueue3Exception e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 5: // clear
				try {
					oq.clear();
				}catch(Queue4.EmptyIntQueue3Exception e){
					
				}
				break;
			default:
				break;
			}
			
		}
	}
}