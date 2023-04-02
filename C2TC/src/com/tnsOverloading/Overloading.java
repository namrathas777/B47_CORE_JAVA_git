package com.tnsOverloading;

public class Overloading {
	private float x;
	private float y;
	public Overloading() {
		x=0.0f;
		y=0.0f;
	}
	public Overloading (float x) {
		this.x=x;
		this.y=y;
		
	}
	public Overloading (float x,float y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {//object class method 
		return "overloading [x=" + x + ", y=" + y + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}