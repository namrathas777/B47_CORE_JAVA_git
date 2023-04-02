package com.tnsInheritance;
import com.tnsInheritance.employee;

public class employeedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee ob1 =new employee();
		System.out.println(employee.companyName);
		employee ob =new employee("raj",123);
		System.out.println(ob);
		employee ob2 =new employee();
		System.out.println(employee.companyName);
		ob =new employee("suma",456);
		System.out.println(ob);

	}

}
