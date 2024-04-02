package Chap8_List;

//단순한 linked list에서 insert, delete하는 알고리즘을 코딩: 1단계

import java.util.Random;
import java.util.Scanner;

class Node1 {
	int data;
	Node1 link;

	public Node1(int element) {
		data = element;
		link = null;
	}

	public Node1() {
		data = 0;
		link = null;
	}
}

class LinkedList1 {
	Node1 first;

	public LinkedList1() {
		first = null;
	}

	public int Delete(int element) { // delete the element{

	}

	public void Show() { // 전체 리스트를 순서대로 출력한다.
		Node1 p = first;
		System.out.println("***리스트 출력***");

		while (p != null) {
			System.out.println(p.data);
			p = p.link;
		}

	}

	public void Add(int element) { // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다

		Node1 temp = new Node1(element);
		if (first == null) {
			first = temp;
			return;
		} else { // 생성되는 값과 생성되어있는 값을 비교하는게 필요
			Node1 p = new Node1();
			Node1 q = first;
			p.link = q;

			while (element > q.data) {
				
					// q가 p를 따라 다닌다. // p는 앞에서부터 쭉 탐색하며 간다.
					// q라는 변수를 만들어서 p를 따라다니게 만들어야한다.
					p = p.link;
					q = q.link;
					if (q == null)break;
				}
				if(q==first)
					// insert 해야한다.
					first = temp;
					temp.link = q;

				} else {
					p.link = temp;
					if (q != null) {
						temp.link = q;
					}
				}

			}

		}

	}

	public boolean Search(int data) { // 전체 리스트를 순서대로 출력한다.
		return true;
	}
}

public class 실습9_1정수연결리스트_test {
	enum Menu { // enum을 실무에서는 많이 사용한다.
				// 반드시 숙지할 것
		Add("삽입"), Delete("삭제"), Show("인쇄"), Search("검색"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())// Menu는 enum values() 는 자바에서 제공되는 메소드로

				if (m.ordinal() == idx) // ordinal은 인덱스 값을 return 해 줌
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string; // 이게 어려운데 어디서 호출되는지 가 중요한데 이건 내일
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---// Menu 클래스와 별개
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu; // 메뉴
		Random rand = new Random();
		System.out.println("Linked List");
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		int data = 0;
		System.out.println("inserted");
		l.Show();
		do {
			switch (menu = SelectMenu()) {
			case Add: // 머리노드 삽입
				data = rand.nextInt(20);
				// double d = Math.random();
				// data = (int) (d * 50);
				l.Add(data);
				break;
			case Delete: // 머리 노드 삭제
				data = sc.nextInt();
				int num = l.Delete(data);
				System.out.println("삭제된 데이터는 " + num);
				break;
			case Show: // 꼬리 노드 삭제
				l.Show();
				break;
			case Search: // 회원 번호 검색
				int n = sc.nextInt();
				boolean result = l.Search(n);
				if (!result)
					System.out.println("검색 값 = " + n + "데이터가 없습니다.");
				else
					System.out.println("검색 값 = " + n + "데이터가 존재합니다.");
				break;
			case Exit: // 꼬리 노드 삭제
				break;
			}
		} while (menu != Menu.Exit);
	}
}
