package com.tnsnestedtry;

public class NestedTry {

	public int nestedtry(int x, int y) {
		int z = 0;
		try {
			z = x / y;
			System.out.println(z);
		} catch (ArithmeticException ar) {
			System.out.println("The system got printed");
		}
		return z;
	}
}