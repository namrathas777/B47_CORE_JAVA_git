package com.tnsnestedtry;

public class ThrowDemo{
	static void avg() {
		System.out.println("avg is throwing exception");
		//ArithmeticException ae = new ArithmeticException();
		throw new ArithmeticException ("done");
	}

}