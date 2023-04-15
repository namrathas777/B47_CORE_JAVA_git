package com.tnsnestedcatch;
/* 
 * Program to demostrate nested catch
 */
public class nestedcatch {
	int arr[]=new int[4];//Declare an array
	void nestedCatch() 
	{
		try {
			String str=null;
			str.equals("hello");//no exception is matched
		//arr[100]=20/0;//Arithemetic Exception occured
		//arr[10]=5;//Array outof bound exception
		System.out.println("try block");
		}
		catch(ArithmeticException a) {
			System.out.println("A number cannot be divided by zero"+a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array element outside specified limit "+e);
		}
		catch(Exception r) {
			System.out.println("no exception match");
		}
	}

}
