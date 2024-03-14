package Chap4_스택과큐;

/*
 * 교재에 있는 소스코드
 * 입력하여 실행 실습
 * 정수형 스택 소스 코드
 * 객체스택과 큐에 대한 구현도 정수 스택의 예외처리 방식을 반복 적용함 
 */
import java.util.Scanner;



//int형 고정 길이 스택

class IntStack5 {
	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택 포인터

//--- 실행시 예외: 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public EmptyIntStackException() {
			System.out.println("스택이 비었다");
		}
	}

//--- 실행시 예외: 스택이 가득 참 ---//2
	public class OverflowIntStackException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public OverflowIntStackException() {
			System.out.println("스택이 꽉 찾다");
		}
	}

//--- 생성자(constructor) ---//
	public IntStack5(int maxlen) {// 모든 데이터를 다 받을 필요없고 여기서 maxlen 사이즈만 선언해주면 객체가 생성될 수 있다.
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}

//--- 스택에 x를 푸시 ---//
	public int push(int x) throws OverflowIntStackException {
		if (isFull()) // 스택이 가득 참 // isFull() 꽉 차면 true가 나온다
			throw new OverflowIntStackException(); // 객체를 던진다. 그러면 받는놈이 있는데 누가 받느냐?
													// throw 는 객체로 던지고 catch는 타입으로 받는다.
		return stk[ptr++] = x;

	}

//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//pop을 하는 과정은 데이터를 빼는데 오류가 나는 상황은 데이터가 비어있는 경우이다.
	public int pop() throws EmptyIntStackException {
		if (isEmpty()) // 스택이 빔 // 권장
//		if (ptr <= 0)
			throw new EmptyIntStackException(); // push 했을때와 pop을 했을때 catch 하는게 다르다. 그레서 메서드 이름과 내용을 달리함
		return stk[--ptr];
	}

//--- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public int peek() throws EmptyIntStackException {
		if (isEmpty()) // 스택이 빔
			throw new EmptyIntStackException();
		return stk[ptr - 1];

	}

//--- 스택을 비움 ---//

	public void clear() throws EmptyIntStackException { // clear에 clear를 하면 예외가 발생해야한다.
		/*
		 * stack을 empty로 만들어야 한다. stack이 empty일 때 clear()가 호출된 예외 발생해야 한다 pop()으로 구현하지
		 * 않는다
		 */
		if (isEmpty()) // 스택이 빔
			throw new EmptyIntStackException();
		ptr = 0;
	}

//--- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) // 꼭대기 쪽부터 선형 검색
			if (stk[i] == x)
				return i; // 검색 성공
		return -1; // 검색 실패
	}

//--- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return ptr;
	}

//--- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return ptr <= 0;
	}

//--- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return ptr >= capacity;
	}

//--- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() throws EmptyIntStackException {
		if (isEmpty()) {
			throw new EmptyIntStackException();

		} else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println();
		}
	}
}
	public class 실습4_2정수스택_배열 {

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			IntStack5 s = new IntStack5(4); // 최대 64 개를 푸시할 수 있는 스택

			while (true) {
				System.out.println(); // 메뉴 구분을 위한 빈 행 추가
				System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
				System.out.print("(1)push　(2)pop　(3)peek　(4)dump　(5)clear  (0)종료: ");

				int menu = stdIn.nextInt();
				if (menu == 0)
					break;

				int x;
				switch (menu) {

				case 1: // 푸시
					System.out.print("데이터: ");
					x = stdIn.nextInt();
					try { // try 블록에서 예외or오류가 발생하면 catch에서 받는다.
						s.push(x);
					} catch (IntStack5.OverflowIntStackException e) { // 자바에서 ()는 함수로 보면된다.
						System.out.println("스택이 가득 찼습니다." + e.getMessage());
						e.printStackTrace(); // IntStack5외부클래스, OverflowIntStackException 내부 클래스
					}

					break;

				case 2: // 팝
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack5.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다." + e.getMessage());
						e.printStackTrace();
					}
					break;

				case 3: // 피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack5.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다." + e.getMessage());
						e.printStackTrace();
					}
					break;

				case 4: // 덤프 // 덤프란? 139p앞에 라인 83에 스택 안의 모든 데이터를 바닥에서 꼭대기 순서로 출력
						// case 4,5 try,catch 구문 만들기
					try {
						s.dump();
						
					} catch (IntStack5.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다." + e.getMessage());
						e.printStackTrace();
					}
					break;

				case 5: // clear
					try {
						s.clear();
					} catch (IntStack5.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다." + e.getMessage());
						e.printStackTrace();
					}
					break;
				}
				
			}
			stdIn.close();
		}
		
	}
