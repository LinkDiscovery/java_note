package com.ruby.java.ch08.innerClass;
interface Messenger{
	String getMessage();
	void setMessage(String msg);
}// 클래스를 딱 한번만 사용하고 사용하지 않을 경우 인터페이스를 구현한 클래스
class GalaxyMessenger implements Messenger{
	//Messenger test = new Messenger() { //여기 중괄호 부터 , 밑에 중괄호 까지 추상메소드를 구현한 클래스를 나타냄
		public String getMessage() {
			return "test";
		}
		public void setMessage(String msg) {
			System.out.println("메시지 = : + msg");
		// 여기는 갤럭시 메신저라는 이름을 부여하고 안에 메서드를 구현하였음 , 밑에 익명 클래스는 , 이름은 부여하지 않았지만 메서드를 구현시킴
}
}
public class MessengerTest {
	public static void main(String[] args) {
		GalaxyMessenger galaxy = new GalaxyMessenger();
		//Messenger test = new Messenger(); // Messenger 은 인터페이스라서 오류가 뜸
		Messenger test = new Messenger() { //여기 중괄호 부터 , 밑에 중괄호 까지 추상메소드를 구현한 클래스를 나타냄
			public String getMessage() {
				return "test";
			}
			public void setMessage(String msg) {
				System.out.println("메시지 = : + msg");
			}
		};// 세미콜론을 왜쳐야하는지 이해해야함 , 인터페이스 구현한 바디 
	
}
}
