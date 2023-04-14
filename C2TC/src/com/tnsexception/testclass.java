package com.tnsexception;

import java.util.Scanner;

public class testclass {
	private static int age;
	static void validate() throws InvalidAge{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = Sc.nextInt();
		if (age< 18)
			throw new InvalidAge ("InvalidAge , You are not Eligible to vote");
		else
			System.out.println("welcome to vote");
		
		
	}
	public static void main(String[] args) {
		try
		{
			validate();
		}
		catch(Exception e) {
			System.out.println("caught the exception"+e);
		}
	}

}
