package Chap6_Sorting;

import java.util.Random;
import java.util.Scanner;

interface MaxHeap {
	public void Insert(int x);

	public int DeleteMax();
}

class Heap implements MaxHeap {
	final int heapSize = 100;// 아무 값도 안 넣었을때 100을 채운다?
	private int[] heap;
	private int n; // current size of MaxHeap
	private int MaxSize; // Maximum allowable size of MaxHeap

	public Heap(int sz) { // 생성자
		super();
		MaxSize = sz;
		n = 0;
		heap = new int[MaxSize + 1];
	}

	public void display() {
		// 배열을 출력한다.
		for (int i = 0; i < n; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void Insert(int x) {// 구현 해야함
		// 코드 가져다가 자바버젼으로 바꾸면 됨 word파일
		int i;
		if (n == MaxSize) {
			HeapFull(); // 메소드 이름은 소문자로 변경되어야 합니다.
			return;
		} else {
			n++;
			for (i = n; i >= 1; i /= 2) {
				 
					if (i == 1)
						break;
					if (x <= heap[i / 2])
						break;
					heap[i] = heap[i / 2];
					
				}
			}
			heap[i] = x;
		}
	

	@Override
	public int DeleteMax() {
		return -1;

	}

	private void HeapEmpty() {
		System.out.println("Heap Empty");
	}

	private void HeapFull() {
		System.out.println("Heap Full");
	}
}

public class Chap6_Test_HeapSort {
	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		int select = 0;
		Scanner stdIn = new Scanner(System.in);
		Heap heap = new Heap(20);
		final int count = 10;
		int[] x = new int[count + 1];
		int[] sorted = new int[count];
		// sorted는 sort에 활용되고 sort이후에 값을 sorted에 차곡차곡 넣으면 오름차순 도는 내림차순의 배열을 만들 수 있다.
		// 다항식
		// 랜덤 난수를 넣여야하는것 아닌가 ?

		do {
			System.out.println("Max Tree. Select: 1 insert, 2 display, 3 sort, 4 exit => ");
			// sort는 delete
			select = stdIn.nextInt();
			switch (select) {
			case 1:
				System.out.println("Input value : ");

				int num = rnd.nextInt(30 + 1);
				heap.Insert(num);
				heap.display();
				break;
			case 2:
				heap.display();
				break;
			case 3: //

				break;

			case 4:
				return;

			}
		} while (select < 5);

		return;
	}
}
