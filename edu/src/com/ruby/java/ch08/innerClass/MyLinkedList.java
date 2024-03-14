package com.ruby.java.ch08.innerClass;

public class MyLinkedList {

	
	
	private Node head =null;
	
	class Node{ // 클래스 안에 클래스 만듬

		private String data;
		private Node link;	
		public Node(String data) {
			//생성자는 필드가 2개이므로 heap에 필드 공간 2개를 할당
		this.data = data;
		this.link = null;
		//위에꺼 this. 이게 없으면 공간만 할당되고 값은 없다.
	
	}

		}
	public void add(String data) {
		Node newNode = new Node(data);
		if(head == null) 
			head =newNode;
		else {
			Node next = head;
			while(next.link != null) {
				next = next.link;
			}
			next.link = newNode;
			}
		}
	public void print() {
	
	}

	public MyLinkedList() {
		this.head=null;
}
}
	