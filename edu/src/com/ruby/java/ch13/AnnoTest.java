package com.ruby.java.ch13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME) // 실행하고 난뒤에 계속해서 살아있어야한다.
@interface Check {
	
	String name();
	int val();
}


public class AnnoTest {

	@Check(name = "first", val=123) // 실행하는 시점에 
	public static void test() {
		AnnoTest obj = new AnnoTest();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("test");
			
			Check check = m.getAnnotation(Check.class);
			System.out.println(check.name()+" : " +check.val());
			
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		test();
	}
}


