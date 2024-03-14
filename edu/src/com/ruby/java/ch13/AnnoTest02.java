package com.ruby.java.ch13;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) // 실행하고 난뒤에 계속해서 살아있어야한다.
@interface Mapping {
	
	String mode();
	int value();
}

@Retention(RetentionPolicy.RUNTIME) // 실행하고 난뒤에 계속해서 살아있어야한다.
@interface Comment {
	
	String msg();

}

@Mapping(mode="class",value =100)
@Comment(msg="Annotation2 클래스")
public class AnnoTest02 {
	
	@Mapping(mode = "method",value = 200)
	@Comment(msg = "test() 메서드")
	public static void test() {
		AnnoTest02 obj = new AnnoTest02();
		
		try {
			Class<?> c = obj.getClass();
			Annotation annoList[] = c.getAnnotations();// getAnnotation 그 클래스에 선언되어있는 어노테이션 정보를 전부 다 가져온다.
			System.out.println("클래스의 annotation 목록");
			for(Annotation item : annoList)
				System.out.println(item);
			
			Method m = c.getMethod("test"); // 
			annoList = m.getAnnotations();
			System.out.println();
			System.out.println("test()메서드의 annotation 목록");
			for(Annotation item : annoList)
				System.out.println(item);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		test();
	}
	
}
