package com.tnsgenerics;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("java");
		list.add(123);
		for (Object ob: list) {
			//String str = (String)ob; //typecasting
			System.out.println(ob);
		}

	}

}
