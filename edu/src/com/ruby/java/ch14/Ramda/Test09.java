package com.ruby.java.ch14.Ramda;

interface Calculator{
	int func();
}

public class Test09 {

	
	static int num1 = 10;
	int num2 = 20;
	
	public static void main(String[] args) {
		Test09 test = new Test09();
		int num3 =30;
		
		Calculator calc = () -> {
			int num4 = 40;
			Test09.num1++;// 왜 num3은 수정이 안되는데 num1,2는 수정이 되는가? test는 수정이 안되지만 test안에 있는 필드값은 변경이 가능하다.
			test.num2++;
			num3++; // 외부 지역변수는 값 변경 불가하다 . final 선언과 비슷 // num 3을 수정한다는 것은 test를 수정 한다는 것이고 test는 수정이 안된다.
			num4++;
			return num4;
		};
	}
}
