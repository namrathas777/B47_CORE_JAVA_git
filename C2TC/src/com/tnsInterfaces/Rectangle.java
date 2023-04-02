package com.tnsInterfaces;
import com.tnsInterfaces.Shape;

public class Rectangle implements Shape {
	private float length;
	private float breadth;
	public Rectangle(float length,float breadth) {//parametersized constructor
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public float calculateArea() {//implementing the abstract method
		// TODO Auto-generated method stub
		float area =length*breadth;
		return area;
	}
	@Override
	public float calculatePerimeter() {
		// TODO Auto-generated method stub
		float perimeter =2*(length+breadth);
		return perimeter;
	}
   
}
