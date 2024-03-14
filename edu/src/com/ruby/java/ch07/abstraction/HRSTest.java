package com.ruby.java.ch07.abstraction;


	abstract class Employee{


		String name;
		int salary;
		
		public abstract void calcSalary();
		public abstract void calcBonus();
		public abstract void calTax();
	}
	
	
	class Salesman extends Employee {
		public void calcSalary() {
			System.out.println("Salesman 급여 = 기본급 + 판매 수당");
		}

		@Override
		public void calcBonus() {
			System.out.println("Salesman 급여 = 기본급 + 12 * 4");
			
		}
		public void calTax() {
			
		}
	}
class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Consultant 급여 = 기본급 + 12 * 2");
		
	}
}
abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
		
	}
}
class Director extends Manager{
	public void calcBonus(){
	System.out.println("Manager 급여 = 기본급 + 12 * 6");
		
	}
		
	}

public class HRSTest{
	public static void calcTax() {
		System.out.println("소득세를 계산합니다");
	}
	if(e instanceof Salesman) { //instanceof > 연산자이다. // 
		System.out.println("Salesman");
	}else if{e instanceof Manager){ // > e 가 Manager의 인스턴스인가? 를 연산하는 것임
		System.out.println("Manager");
	}
		
	}
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		Employee e = new Salesman();
		Manager
		
		Object s3 = new Salseman();
		Object arr[] = new Object[6];
		
		arr[0] = s;arr[1] = e;arr[2] = d;
		arr[0] = s3;arr[4] = s;
		//Employee b = new Employee();

		Salesman s2 = s;

		if(s.equals(s2))
			System.out.println("같은객체");
		else
			System.out.println("다른객체");
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		
		HRSTest.calcTax(c);
		calcTax(e);
		calcTax(c);
	
}



	private static void calcTax(Director d) {
		System.out.println("소득세를 계산합니다");// TODO Auto-generated method stub
		
	}



	private static void calcTax(Consultant c) {
		System.out.println("소득세를 계산합니다");// TODO Auto-generated method stub
		
	}



	private static void calcTax(Salesman s) {
		System.out.println("소득세를 계산합니다");	// TODO Auto-generated method stub
		
	}
}



