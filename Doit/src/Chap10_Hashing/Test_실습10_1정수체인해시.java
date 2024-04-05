package Chap10_Hashing;

import java.util.Scanner;
//체인법에 의한 해시
//--- 해시를 구성하는 노드 ---//
// 정수버젼, 책은 제네릭으로 되어있음 
class Node {
    private int key;          // 키값
    Node next;        // 뒤쪽 포인터(뒤쪽 노드에 대한 참조)
    
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}

	public Node(int key) {
		this.key = key;
		this.next = null;
		
	}
    
}
class SimpleChainHash {
 private int    size;              // 해시 테이블의 크기
 private Node[] table;        // 해시 테이블
 
 public SimpleChainHash(int capacity) {
	try {
	 table = new Node[capacity];
	this.size = capacity;
	} catch(OutOfMemoryError e) { // 테이블 생성 불가 
		this.size = 0;
	}
	
}
 public int hashValue(int key) {
	 return (key*key*14119)%size; // index 값 리턴 
 }
 

 //--- 키값이 key인 요소를 검색(데이터를 반환) ---//
 public int search(int key) {
	 int hash = hashValue(key); // hash 안에는 index값 저장 
	 Node p = table[hash];// table [인덱스 값]
	 
	 while (p!= null) {
		 if(p.getKey() == key)
			return -1;
		 p=p.next;
	 }
	return 1;
	 
 }

 //--- 키값이 key인 데이터를 data의 요소로 추가 ---//
 public int add(int key) {
	 int hash = hashValue(key);
	 Node p = table[hash];// table 어떻게 보면 first 같은 것인가? 
	 
	 while(p!=null) {
		 if(p.getKey()==key)
			 return 0;
		 p = p.next; // p.next 는 현재 null 값임 		
	 }
	 Node temp = new Node(key);
	 temp.next = table[hash];
	 table[hash]=temp;
	 
	 return 1;
	 
 }

 //--- 키값이 key인 요소를 삭제 ---//
 public int delete(int key) {
	 int hash = hashValue(key);
	 Node p = table[hash];
	 Node q = null;
	 
	 while(p !=null) {
		 // key 값을 삭제 해야한다. 
		 if(p.getKey()==key) {
			 if(q==null)
				 table[hash] = p.next;
			 else
				 q.next = p.next;
			 return 0;
			 
		 }
		 q=p;
		 p = p.next;
	 }
	 return 1; 
	 
 }

 //--- 해시 테이블을 덤프(dump) ---//
 public void dump() {
	 for (int i = 0 ; i < size; i++) {
		 Node p = table[i];
		 System.out.printf("%02d ",i);
		 while (p!=null) {
			 System.out.printf("-> %s ",p.getKey());
			 p= p.next;
		 }
		 System.out.println();
	 }
	 
 }
}

public class Test_실습10_1정수체인해시 {

	enum Menu {
		Add("삽입"), Delete("삭제"), Search("검색"), Show("출력"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}
		// --- 메뉴 선택 ---//
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


//체인법에 의한 해시 사용 예
 public static void main(String[] args) {
	 	Menu menu;
		SimpleChainHash hash = new SimpleChainHash(11);
		Scanner stdIn = new Scanner(System.in);
		int select = 0, result = 0, val = 0;
		final int count = 15;
		do {
			switch (menu = SelectMenu()) {
			case Add:

				int[] input = new int[count];
				for (int ix = 0; ix < count; ix++) {
					double d = Math.random();
					input[ix] = (int) (d * 20);
					System.out.print(" " + input[ix]);
				}
				for (int i = 0; i < count; i++) {
					if ((hash.add(input[i])) == 0)
						System.out.println("\n"+"Insert Duplicated data");
				}
				break;
			case Delete:
				// Delete
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.delete(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;
			case Search:
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.search(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;

			case Show:
				hash.dump();
			break;
		}
	} while (menu != Menu.Exit);

	}
}
