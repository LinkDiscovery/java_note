package com.ruby.java.ch08.innerClass;


class Node3 {

	int data;
	Node3 link; // String st = "123"; String도 클래스다 . 
	public Node3(int data) {
		this.data = data; link = null;
	}
}
class LinkedList3 {

	Node3 first; // int first 는 정수를 저장하는 first 공간을 마련하는데 
	// node 는 first 라는 공간에 node 를 저장 
	public LinkedList3() {//생성자 , 함수 // 생성자 함수가 굳이 필요없을지도?
		first = null;
	}
// 링크 리스트의 값 입력 
	void append(int data) {

		Node3 p = first;
		Node3 q = null; // 얘는 어떤 null값을 가리키고 있는 거지? 아니면 아예 새로운 heap 공간에 null이라는 값이 할당이 된 것인가?
		//추가 코딩을 해야함. Node3 p = first ; 처음에
		Node3 newNode = new Node3(data); //  데이터 공간 ㅁ 링크 공간 ㅁ // ㅁㅁ  
		
		if(p==null) {
			first = newNode; // stack  에서 heap 로 바뀌게 된 것? 
			return;
		} else {
			while (p != null) {
				q=p;
				p=p.link;
			}
			q.link = newNode;
		}
	}

// 링크 리스트의 값 출력 
	void showList() {
		System.out.println();
		Node3 p = first;
		
		 while (p != null) {
	            System.out.print(p.data + " ");
	            p = p.link;
	        }
	    }
	
	
	
	// 노드의 중간에 값 끼워넣기 
	void insert(int data) {
		Node3 newNode = new Node3(data);
		Node3 p = first, q = null;

		if (p == null) {
            // 리스트가 비어있는 경우
            first = newNode;
            return;
        }

        while (p != null && p.data < data) {
            q = p;
            p = p.link;
        }

        if (q == null) {
            // 삽입 위치가 첫 번째 노드인 경우
            newNode.link = first;
            first = newNode;
        } else {
            // 중간이나 끝에 삽입하는 경우
            newNode.link = p;
            q.link = newNode;
        }
    }

	}


	public class Test연결리스트와배열1 {
		// getList > 배열의 값 넣기 
		static int getList(int[]data) {
			int count = 0;
			int mid = data.length/2;
			for (int i = 0; i <= mid; i++) {
				data[i] = i * 5; count++;
			}
			return count;
		}
		
		// showList는 배열의 값 출력 (int[]data)
		static void showList(int[]data) {
			System.out.println();
			for (int i=0; i < data.length; i++)
				System.out.print(" " + i + " ");
			System.out.println();
			for (int i = 0; i < data.length; i++) {
				if (data[i] < 10)

					System.out.print(" ");
				System.out.print(data[i]+ " ");
			}
		}

		
		// insertList 는 배열의 중간에 값 끼워넣기 
		static int insertList(int[] data, int count, int x) {
			int indx = 0;
			//			for() {
			while(indx < data.length) {
				if(x<data[indx]) {
					while(indx < data.length) {
						int temp = data[indx];
						data[indx] =x;
						x = temp;
						indx++;
					} 
					break;
				}
				else {
					indx++;
					
				}
			}
			return ++count;
		}

		public static void main(String[] args) {
			int[]list = new int[10];
			int count = 0;
			System.out.println("배열로 리스트::");
			count = getList(list);
			showList(list);
			count = insertList(list, count, 3);
			showList(list);
			count = insertList(list, count, 7);
			showList(list);
			// part 1 , 배열가지고 list 하는 걸 해보는 것 

			//************************************
			LinkedList3 ll = new LinkedList3(); // 생성자 , 메모리 heap에 할당된 주소를 반환하는 것이 new 기능 

			// 1. heap에 공간 할당 
			// 2. 할당된 공간의 주소를 반환
			

			ll.append(5);
			ll.append(10);
			ll.append(15);
			ll.append(20);
			ll.append(25);
			ll.showList();
			ll.insert(3);ll.showList();
			ll.insert(7);ll.showList();
			// linked list를 가지고 하는 것
		}
	}

