package com.ruby.java.ch05;

class Armor {

	 String name = "홍길동";
	private int height= 180;
	private int weight = 100;
	private String color = "Red";
	
	 void takeOff() {
		System.out.println("Take Off");
	}
	private void land() {
		System.out.println("Land");
	}
	private void shootLaser() {
		System.out.println("ShootLaser");
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
public class ArmorTest {
	public static void main(String[] args) {
		Armor armor = new Armor();
		armor.takeOff();
		
		//armor.name="홍길동";
	}
}





