package com.ruby.java.ch13.boundGen;

class Bag<T extends Solid> { 
	private T thing;
	
	public Bag(T thing) {
		this.thing = thing;

		
	}
	public T getThing() {

		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}


void showType() {
	System.out.println("T의 타입은" + thing.getClass().getName());

}
}

class Solid{}
class Liquid{}
class Book extends Solid{}
class PencilCase extends Solid{}
class NoteBook extends Solid{}

class Water extends Liquid{}
class Coffee extends Liquid{}

public class BagTest2 {
	
public static void main(String[] args) {
	
	Bag<Book> bag = new Bag<>(new Book()); // 가방안에 다양한 타입 넣을 때
	Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
	Bag<NoteBook> bag3 = new Bag<>(new NoteBook());

	Bag<Water> bag4 = new Bag<>(new Water());
	Bag<Coffee> bag5 = new Bag<>(new Coffee());
	

	
//	Bag<PencilCase> bag2 = new Bag<>(new PencilCase()); //PencilCase를 담을 수 있음 
//	Bag<NoteBook> bag3 = new Bag<>(new NoteBook());//NoteBook을 담을 수 있음
	
	

//	bag2.showType();
//	bag3.showType();
//	bag = bag2; // ch13 bagTest2와 비교하기 , 제네릭에서는 타입을 따지기 때문에 오류가 뜬다. 
}
}