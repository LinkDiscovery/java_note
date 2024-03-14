package com.ruby.java.ch06;

import java.util.HashMap;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
* static 멤버 함수 구현
* toString() 함수 구현과 사용
* 객체 배열 사용
*/
abstract class InterfaceStudents {
	public abstract void showObject();
		
	
}

class Student extends InterfaceStudents {
	
	HashMap ri = new HashMap();
static int countStudents;//객체수 , 객체가 만들어질때마다 증가
int sid;//학번
String sname; //학생 이름
String city; //주소 도시

public Student() {// default 생성자
	countStudents++;
}
public Student(int sid) { //얘도 생성자 
	this();
	this.sid = sid;

}
public Student(int sid, String name) {
	this(sid);
	this.sname=name;

	
}
public Student(int sid, String name, String city) {
	this(sid,name);

	this.city=city;

}
@Override
public String toString() {
	 return "sid="+sid + ", sname=" + sname + ", city=" + city;
}
public void showObject() {
	 System.out.println("["+sid +", " + sname + ", " + city+"]");
}
static void showNumberObjects() {//생성된 객체수를 출력한다.

	 System.out.println(" 생성객체수=" + countStudents);
}
}
class WorkStudent extends Student {
	String eno;
	String company;
	

	public WorkStudent(int id, String sname, String city ,String eno ,String company ) {
//		this.sid = id;
//		this.sname = name;
//		this.city = city;
		super(id,sname,city); // 이걸 사용할 줄 알아야함. 부모클래스의 변수를 받아오는 것 // super는 따로 생성자를 안하는데 어떻게?
		this.eno = eno;
		this.company = company;
	}

	 public WorkStudent() {
		 
	
		 
		// TODO Auto-generated constructor stub
	}

	public String toString() { // 
		super.toString();
		 return "["+eno +", " + company + ", "+sid+","+"..."+"]";
	 }
	@Override
	 public void showObject() {
		 //Student 출력 코드 추가
		 super.showObject();
		 System.out.println("["+eno +", " + company + "]");
	 }
}
class CodingWorkStudent extends WorkStudent {

	String language;
	@Override
	 public String toString() {
		super.toString();
		 return "["+eno +", " + company + "]";
	 }
	 public void showObject() {
		 super.showObject(); 
		 System.out.println("["+language+"]");
	 }
}
// 생성자 구현한다.
public class Test_객체지향 {
	 static void showObjects(InterfaceStudents is) {
		 is.showObject();
	 }
	 public static void main(String[] args) {
		 
	 Student arry[] = new Student[6];
	 Student a1 = new Student(); // toString test 용 객체 생성
	 a1.showObject();
	 Student.showNumberObjects();
	 arry[0] = new Student();//default 생성자
	 arry[1] = new Student(202301);
	 arry[2] = new Student(202301, "Hong");
	 arry[3] = new Student(202301, "Hong", "Busan20000");
	 arry[4] = new WorkStudent(123,"d","d","w","e");
	 arry[5] = new CodingWorkStudent();
	 Student.showNumberObjects();
	System.out.println(a1); 
	 for (Student s : arry) {
		 System.out.println(s.toString());
	 }

}
	 

}
