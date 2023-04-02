package com.tnspackage;
import java.util.Scanner;
public class Exceutor {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		CarClass ob = new CarClass();//creation of object
		ob.backward();//calling the member function of the carClass
		ob.forward();
		ob.stop();
		Scanner Sc = new Scanner(System.in);
		System.out.println("reg is "+ob.reg);
		System.out.println("reg is "+ob.amount);
	}

}