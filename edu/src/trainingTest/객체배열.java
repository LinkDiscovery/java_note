package trainingTest;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
* static 멤버 함수 구현
* toString() 함수 구현과 사용
* 객체 배열 사용
*/
abstract class InterfaceStudents {
	public abstract void showObject();
}

// ------------------------------------
//student class 추상클래스 상속

class Student extends InterfaceStudents {

static int countStudents;//객체수

int sid;//학번
String sname; //학생 이름
String city; //주소 도시

public Student() {
//		sid = 0;
//		sname = null;
//		city = null;
	countStudents++;
}

//생성자 오버로딩
public Student(int sid) {
	this();
	this.sid=sid;
}


public String toString() {
	 return "sid="+sid + ", sname=" + sname + ", city=" + city;
}
public void showObject() {
	 System.out.println("["+sid +", " + sname + ", " + city+"]");
}
//--------------------------------독자적 메소드 스텍

static void showNumberObjects() {//생성된 객체수를 출력한다.
	 System.out.println(" 생성객체수=" + countStudents);
}
}

//-------------------------------------------다른 클래스
//work student class // student 상속 // showobject 메소드 반드시 정의 

class WorkStudent extends Student {
	String eno;
	String company;

	public WorkStudent() {

	}

	public WorkStudent(String eno, String company) {
		this();
		this.eno = eno;
		this.company = company;

	}




	public WorkStudent(int sid) {
		super.toString();
		
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		super.toString();
		 return "["+eno +", " + company + "]";
	 }
	 
	 public void showObject() {
		 super.showObject();
		 System.out.println("["+eno +", " + company + "]");
	 }
}

//---------------------------------------------------
//codingworkstudent workstudent 상속 showobject 반드시 정의 

class CodingWorkStudent extends WorkStudent {
	String language; // 추가 변수

	@Override
	public String toString() {
		 super.toString();
		 return "["+language+"]";
	 }
	 public void showObject() {
		 super.showObject();
		 System.out.println("["+language+"]");
	 }
}
// 생성자 구현한다.
public class 객체배열 {
	 static void showObjects(InterfaceStudents is) {
		 is.showObject();
	 }
	 public static void main(String[] args) {
	 Student arry[] = new Student[5];
	 Student.showNumberObjects();
	 arry[0] = new Student();
	 arry[1] = new Student(202301);
	 arry[2] = new WorkStudent(12);
	 arry[3] = new CodingWorkStudent();
	 arry[4] = new WorkStudent("이야", "회사");
	 Student.showNumberObjects();
	 for (Student s : arry) {
		 System.out.println(s.toString());
	 }
	 for (Student sx : arry) {
		 showObjects(sx);
	 }
}

}

