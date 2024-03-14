package com.ruby.java.ch08.polymorphism;
/*
 * 인터페이스 다형성 실습 코드
 */
interface Vehicle {
	public abstract void showVehicle();
}
class Truck implements Vehicle {
	int weight;
	public Truck(int weight) {
		this.weight=weight;
	}
	public void showVehicle() {
		System.out.println("Truck: weight="+ weight);
	}
}
class Car implements Vehicle {
	int vehicleOccupants;
	public Car(int vehicleOccupants) {
		this.vehicleOccupants=vehicleOccupants;
	}
	public void showVehicle() {
		System.out.println("Car: vehicleOccupants="+vehicleOccupants);	
	}
	
}
class Taxi extends Car {
	int mileage;
	public Taxi(int vehicleOccupants, int mileage ) {
		super(vehicleOccupants); //car의 생성자를 만드는 것
		this.mileage=mileage;
	}
	public void showVehicle() {
		super.showVehicle();
		System.out.println("Taxi: mileage="+mileage);
	}
}
class MotorCycle implements Vehicle{
	int price;
	public MotorCycle(int price) {
		this.price=price;
	}
	public void showVehicle() {
		System.out.println("MotorCycle: price="+price);
	}
}
public class 인터페이스다형성실습 {
	public static void displayVehicles(Vehicle [] a) {
		for (Vehicle v : a) {
			v.showVehicle();
		}
	}
public static void main(String[] args) {
	Vehicle [] arr = new Vehicle[5];// 객체를 만드는 것이 아니라 배열을 만듬 // 인터페이스도 객체는 만들지 못함, 이것은 배열을 만든것임
//	arr[5] = new Vehicle(); > 인터페이스라서 변수를 못만듬 에러뜸 
	arr[0] = new Truck(33);
	arr[1] = new Car(4);
	arr[2] = new Taxi(2, 9000);
	arr[3] = new Truck(22);
	arr[4] = new MotorCycle(12000);
	
	displayVehicles(arr);
}// 자료구조 코딩할때 가장 기본적인 코딩

}
