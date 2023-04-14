package com.tnsvector;
import java.util.*;
public class vectordemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		//add the elements
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		//insert the element index 5
		v.insertElementAt(6,5);
		System.out.println(v);
		v.elementAt(0);
		System.out.println(v);

		//removing the element index 2
		v.removeElementAt(4);
		System.out.println(v);
		v.capacity();
		System.out.println(v);
		v.size();
		System.out.println(v);
		v.elementAt(2);
		System.out.println(v);
		v.clear();
		System.out.println(v);
	}

}
