package com.ruby.java.ch14.methodRef;

interface StringFunc{
	String modify(String s);
}


public class Test10 {

	 String func(String s ) {
		String result = "";
		char c;
		for(int i = 0; i < s.length(); i++) {
			c= s.charAt(i);
			if(c ==',');
			else
				result +=c;
		}
		return result;
	}
	public static void main(String[] args) {
		
		Test10 obj = new Test10();
		StringFunc sf = obj::func;
		
//		StringFunc sf = Test10::func;//이 문장이 성립되기 위한 전제조건이 1가지 있다. 인터페이스의 리턴타입과 Test10의 리턴타입이 같아야한다. 
									 // 같은 타입의 파라미터도 , String 타입이면 String 타입으로 통일 
		                             // Test10의 String func(String s) 가 static으로 선언되었을 때 Test10::func 를 사용할 수 있다.
		String str = "Korea, Australia, China, Germany, Spain, Turkey";
		String result = sf.modify(str);
		System.out.println(result);
		
		String str2 = "서울, 도쿄, 북경, 뉴욕, 발리";
		result = sf.modify(str2);
		System.out.println(result);
	}
}
	
	

