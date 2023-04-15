package com.tnsexception;

public class withoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		try {
			int a=48/d;//exception occured here
			System.out.println("This will not be printed");
		}catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("This will be printed");

	}

}
