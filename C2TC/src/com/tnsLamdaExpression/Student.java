package com.tnsLamdaExpression;

public class Student {
int rollno;
String name,address;
public Student(int rollno, String name, String address) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
	
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
}
public int getRollNo() {
	return rollno;
	
}
public String getName() {
	return name;
}
}
