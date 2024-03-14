package com.ruby.java.ch13;

class Bag { 
	private Object thing;
	

	public Bag(Object thing) {
		
		this.thing =thing;
	}
	public Object getThing() {
		return thing;
	}
	public void setThing(Object thing) {
		this.thing = thing;
	}


void showType() {
	System.out.println("T의 타입은" + thing.getClass().getName());
}
}

class Book{}

class PencilCase{}
class NoteBook{}

public class BagTest2 {
	
public static void main(String[] args) {
	
	
	Bag bag = new Bag(new Book()); // book을 담을 수 있음 
	Bag bag2 = new Bag(new PencilCase()); //PencilCase를 담을 수 있음 
	Bag bag3 = new Bag(new NoteBook());//NoteBook을 담을 수 있음
	
	
	
	
	bag.showType();
	bag2.showType();
	bag3.showType();
	
	bag = bag2; // 오류가 안떳지만 코드가 오작동한다. 같은 오브젝트 객체라서 오류는 안떳지만 안의 데이터 타입은 다르기 때문에
}
}