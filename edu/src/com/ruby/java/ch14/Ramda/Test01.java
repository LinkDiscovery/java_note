package com.ruby.java.ch14.Ramda;


interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface{
	@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("Myclass1");	
	}
}

class MyClass2 implements MyInterface{
	@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("Myclass2");	
	}
}

public class Test01 {
	
		public static void test(MyInterface mi) { // 인터페이스 자체를 파라미터로 받는다. 실제로는 많이 사용되는 방법
			mi.print();
		}

		public static MyInterface test2() {
			MyInterface mi = new MyInterface() {
				
				@Override
				public void print() {
					// TODO Auto-generated method stub
					System.out.println("test2()메서드에서 반환된 MyInterface");
				}
			}; 
			return mi;
		}
	
	
public static void main(String[] args) {
	MyClass1 my1 = new MyClass1();
	MyClass2 my2 = new MyClass2();
	my1.print();
	my2.print();
	
	MyInterface mi = new MyInterface() {
		
		@Override
		public void print() {
			// TODO Auto-generated method stub
		System.out.println("익명 클래스로 구현");	
		}
	};
	
	test(my1);
	test(mi);
	
	mi.print();
	
	
	(new MyInterface() {
		
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("선언,생성,호출을 한번에 처리");
		}
	}).print(); // 딱한번만 사용할 때 , 변수도 안만들고 진행
	

MyInterface mi2 =test2();
mi2.print();

}
	
}
