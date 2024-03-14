package com.ruby.java.ch14.Ramda;

import java.util.function.Function;
// 최상위 추상 클래스 Gemeotry 생성 ==> 추상 메서드로 면적구하는 메서드 선언 


abstract class Geometry{
	abstract double getArea();
}
//자식 클래스들 생성 
class Circle extends Geometry{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	@Override
	double getArea() {
		
		return Math.PI*radius*radius;
	}
	
	}
	
class Rectangle extends Geometry{
	int width;
	int height;
	public Rectangle(int width,int height) {
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
}

class Triangle extends Geometry{
	int width;
	int height;
	public Triangle(int width,int height) {
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
		
}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (double)(height*width*0.5);
	}
}

public class mission {
public static void main(String[] args) {
	Function<Geometry, Double> func = (g) -> {
		return g.getArea(); 
		
};
System.out.println("원 면적:" + func.apply(new Circle(5)));
System.out.println("사각형 면적:" + func.apply(new Rectangle(5,10)));
}
}







