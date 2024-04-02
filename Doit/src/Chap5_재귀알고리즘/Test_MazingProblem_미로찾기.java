package Chap5_재귀알고리즘;
//백트래킹문제풀이 


import java.util.ArrayList;
import java.util.List;

enum Directions2 {
	N, NE, E, SE, S, SW, W, NW
}

class Items3 {
	int x;
	int y;
	
	int dir;

	public Items3(int x, int y, int d) {
		this.x = x;
		this.y = y;
		this.dir = d;
	}

	@Override
	public String toString() {
		return "x = " + x + ", y = " + y + ", dir = " + dir;
	}
}

class Offsets3 {
	int a;
	int b;

	public Offsets3(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class StackList {
	private List<Items3> data; // 스택용 배열
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

	// --- 실행시 예외 : 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public EmptyIntStackException() {
		}
	}

	// --- 실행시 예외 : 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public OverflowIntStackException() {
		}
	}

	// --- 생성자(constructor) ---//
	public StackList(int maxlen) {
		top = 0;
		capacity = maxlen;
		try {
			data = new ArrayList<>(0); // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}

	// --- 스택에 x를 푸시 ---//
	public void push(Items3 p) throws OverflowIntStackException {
		if (top >= capacity) // 스택이 가득 참
			throw new OverflowIntStackException();
		data.add(p);
		top++;
		return;
	}

	// --- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public Items3 pop() throws EmptyIntStackException {
		if (top <= 0) // 스택이 빔
			throw new EmptyIntStackException();
		return data.remove(--top);
	}

	// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public Items3 peek() throws EmptyIntStackException {
		if (top <= 0) // 스택이 빔
			throw new EmptyIntStackException();
		return data.get(top - 1);
	}

	// --- 스택을 비움 ---//
	public void clear() {
		top = 0;
	}

	// --- 스택에서 x를 찾아 인덱스(벌견하지 못하면 –1)를 반환 ---//
	public int indexOf(Items3 x) {
		for (int i = top - 1; i >= 0; i--) // 정상 쪽에서 선형검색
			if (data.get(i).equals(x))
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// --- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

	// --- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

	// --- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

	// --- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() {
		if (top <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < top; i++)
				System.out.print(data.get(i) + " ");
			System.out.println();
		}
	}
}

public class Test_MazingProblem_미로찾기 {

	static Offsets3[] moves = new Offsets3[8];// static을 선언하는 이유를 알아야 한다
	// moves[0].a = 숫자로 값을바꿀수있다.
	// moves[tmp.dir] = moves[tmp.dir+1];

	public static void path(int[][] maze, int[][] mark, int ix, int iy) {

		mark[1][1] = 1;
		StackList st = new StackList(50);
		Items3 temp = new Items3(0, 0, 0);// N :: 0
		temp.x = 1; // 행
		temp.y = 1; // 렬
		temp.dir = 2;// E:: 2 //
		mark[temp.x][temp.y] = 2;// 미로 찾기 궤적은 2로 표시
		st.push(temp);

		while (!st.isEmpty()) // stack not empty// stack is not empty
		{
			
			Items3 tmp = st.pop(); // unstack
			int i = tmp.x; //
			int j = tmp.y;
			int d = tmp.dir;
			mark[i][j] = 1;// backtracking 궤적은 1로 표시

			while (d < 8) // moves forward
			// next move를 하고 싶으면 일단 주위의 maze[i][j]값중에서 0이 아닌값을 찾아야한다.
			// 현재 maze[1][1] = 1 인 상태 이고 아직 검색을 하지 않은 상태이다.
//					int g,h=0;
//					if(maze[i+moves[d].a][j+moves[d].b]==0)
//						mark[i-1][j-1]=2;
			{
				int g = i + moves[d].a;
				int h = j + moves[d].b;
				

				// g, h next move 위치로 정의
				if ((g == ix) && (h == iy)) { // reached exit, ix,iy는 미로의 크기
												
					// output path
					System.out.println("미로의 답을 찾았습니다. 경로는 다음과 같습니다.");
					st.pop();
					int i1 = tmp.x;
					
					int j1 = tmp.y;
					int go = mark[i1][j1];
					

				}

				if ((maze[g][h] == 0) && (mark[g][h] == 0)) { // new position, 초깃값은 
					 
					//mark[g][h]=1;
					mark[g][h]=2;
					mark[i][j]=1;
					d++;
					tmp = new Items3(i,j,d); // 변수 이해 숙달 
					
					st.push(tmp);
					i=g;
					j=h;
					d=0;
					 
				} else {
					d++;
					
				}
				
			}
			
			
		}
		System.out.println("no path in maze ");
		
	}

	static void showMatrix(int[][] d, int row, int col) {
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				System.out.print(d[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] maze = new int[14][17];
		int[][] mark = new int[14][17];

		int input[][] = { // 12 x 15
				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, 
				{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, 
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, 
				{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, 
				{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, 
				{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 } };
		for (int ia = 0; ia < 8; ia++)
			moves[ia] = new Offsets3(0, 0);// 배열에 offsets 객체를 치환해야 한다.
		moves[0].a = -1; moves[0].b = 0;
		moves[1].a = -1; moves[1].b = 1;
		moves[2].a = 0; moves[2].b = 1;
		moves[3].a = 1; moves[3].b = 1;
		moves[4].a = 1; moves[4].b = 0;
		moves[5].a = 1; moves[5].b = -1;
		moves[6].a = 0; moves[6].b = -1;
		moves[7].a = -1;moves[7].b = -1;
		// moves[0] = Offsets3(-1,0)
		// moves[1] = Offsets3(-1,1)
		// moves[2] = Offsets3(0,1)
		// moves[3] = Offsets3(1,1)
		// moves[4] = Offsets3(1,0)
		// moves[5] = Offsets3(1,-1)
		// moves[6] = Offsets3(0,-1)
		// moves[7] = Offsets3(-1,-1)

		// Directions2 enum의 0번째 값을
		// Directions d;
		// d = Directions.N;
		// d = d + 1;//java는 지원안됨
		System.out.println("main print");
		System.out.println(maze.length);

		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 17; j++) {
				if (i == 0 || j == 0 || i == maze.length - 1 || j == maze[0].length - 1) {
					maze[i][j] = 1;
				} else {
					maze[i][j] = input[i-1][j-1];
				}
			}
		}

//			for (int i = 0; i < 12; i++) {
//				for (int j = 0; j < 15; j++) {
//
//						maze[i+1][j+1] =input[i][j];
//				}
//			}
		System.out.println("maze[12,15]::");
		showMatrix(maze, 13, 16);

		System.out.println("mark::");
		showMatrix(mark, 13, 16);

		path(maze, mark, 12, 15);
		System.out.println("mark::");
		showMatrix(mark, 12, 15);
	}

}
