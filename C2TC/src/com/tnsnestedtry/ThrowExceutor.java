package com.tnsnestedtry;
import com.tnsnestedtry.ThrowDemo;

public class ThrowExceutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowDemo.avg();
		}
		catch(ArithmeticException e) {
			System.out.println("caught");
		}

	}

}