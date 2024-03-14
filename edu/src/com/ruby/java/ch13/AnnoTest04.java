package com.ruby.java.ch13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.security.DomainCombiner;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str() default "guest";
	int val() default 1004;
	
}

public class AnnoTest04 {

	@MyAnno
	public static void test() {
		AnnoTest04 obj = new AnnoTest04();
		
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("test");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + ":" + anno.val());
		}catch(Exception e) {
			e.printStackTrace();
	
		}
	}
	public static void main(String[] args) {
		test();
	}
}