package com.ruby.java.ch13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

@interface Service{
	
}


@Service
public class AnnoTest03 {

	public static void main(String[] args) {
		AnnoTest03 obj = new AnnoTest03();
		
		try {
			Class<?> c = obj.getClass();
			if(c.isAnnotationPresent(Service.class))
				System.out.println("Service 어노테이션을 지정함");
		} catch(Exception e ) { 
			e.printStackTrace();
		}
	}
}
