package com.tnstreesetuserdefined;

public class Student {
	private String name;
	private int Marks;
	//Adder getters and Setters
	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}
	
//to String method
	@Override
	public String toString() {
		return "Student [name=" + name + ", Marks=" + Marks + "]";
	}
	//parameterized Constructor



public Student(String name, int marks) {
	super();
	this.name = name;
	Marks = marks;
}



	

}
