package com.tnsOverloading;
import com.tnsOverloading.Overloading;

public class OverloadingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ob =new Overloading();
		System.out.println(ob);//default constructor is called
		Overloading ob1 = new Overloading(14.5f);
		System.out.println(ob1);
		Overloading ob2 =new Overloading(14.5f,15.6f);
		System.out.println(ob);

		

	}

}
