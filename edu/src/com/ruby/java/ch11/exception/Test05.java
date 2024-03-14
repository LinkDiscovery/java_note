package com.ruby.java.ch11.exception;

public class Test05 {

	
	int battery = 0; 
	
	
	public void charge(int time) throws Exception	 {
		
		if(time < 0) { 
			time = 0; 
		
				throw new NagativeNumberException("음수는 안됀다");
		
		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}
	
	public static void main(String[] args) {
		 Test05 test = new Test05();

		 try {
			test.charge(30);
			 test.charge(20);
			 test.charge(-10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}//exception 처리를 메인
