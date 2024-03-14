package com.ruby.java.ch07;

public class LMSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e =new Employee();//super(); 생략 되어 있음
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처"); // 부서 dept
		
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");
				
		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}

}
