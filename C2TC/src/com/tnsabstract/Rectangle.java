package com.tnsabstract;


import com.tnsabstract.Shape;

public class Rectangle extends Shape {
	float width,length;
	Rectangle(){
		this.width=5.0f;
		this.length=2.0f;
	}
	Rectangle(float width,float length){
		this.width=width;
		this.length=length;
		
	}
	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area=width*length;
	}
	
}
