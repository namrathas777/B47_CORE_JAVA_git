package com.tns.superkeyword;
class TestParent{
	protected void test() {
		System.out.println("This is a parent class");
	}
}
public class TestChild extends TestParent{
	protected void test() {
		System.out.println("This is child class test");
	}
	void display() {
		test();
		super.test();
	}

}