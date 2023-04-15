package com.tnsnestedtry;
import java.util.Scanner;
public class nesteddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("enter the value of x and y");
        int x = ob.nextInt();
        int y = ob.nextInt();
        System.out.println("value of x and y "+x+" "+y );
        NestedTry obj =new NestedTry();
        obj.nestedtry(x,y);
	}

}
