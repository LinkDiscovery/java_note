package com.ruby.java.ch12.input_output;

class Bag<T,N> { 
	private T thing;
	private N name;
	
	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
		
	}
	
	public Bag(T thing) {
		
		this.thing =thing;
	}
	public T getThing() {

		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}




public N getName() {
	return name;
}

public void setName(N name) {
	this.name = name;
}
void showType() {
	System.out.println("T의 타입은" + thing.getClass().getName());
	System.out.println("N의 타입은" + thing.getClass().getName());
}
}

class Book{
public String toString() {
	return "책";
}
}
class PencilCase{}
class NoteBook{}

public class BagTest {
	
public static void main(String[] args) {
	
	Bag<Book, PencilCase> bag = new Bag<>(new Book(), new PencilCase()); // 가방안에 다양한 타입 넣을 때
	Bag<Book, String> bag1 = new Bag<Book,String>(new Book(), "과학"); // book을 담을 수 있음 
	
	bag1.showType();
	
	Book book = bag1.getThing();
	String name = bag1.getName();
	
	System.out.println("Thing is : " + book);
	System.out.println("name is : " + name);
	
//	Bag<PencilCase> bag2 = new Bag<>(new PencilCase()); //PencilCase를 담을 수 있음 
//	Bag<NoteBook> bag3 = new Bag<>(new NoteBook());//NoteBook을 담을 수 있음
	
	

//	bag2.showType();
//	bag3.showType();
//	bag = bag2; // ch13 bagTest2와 비교하기 , 제네릭에서는 타입을 따지기 때문에 오류가 뜬다. 
}
}