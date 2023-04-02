package com.tnsexception;

public class defaultdemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			str.equals("Hello");
		}catch(NullPointerException e ) {
			System.out.println("This is done");
		}
		

	}

}
