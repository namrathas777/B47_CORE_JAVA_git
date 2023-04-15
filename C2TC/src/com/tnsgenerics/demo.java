package com.tnsgenerics;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTest<String> obj = new GenericTest<String>();
       obj.add("hello");
       System.out.println(obj.get());
       GenericTest<Integer> obj1 = new GenericTest<Integer>();
       
	}

}
