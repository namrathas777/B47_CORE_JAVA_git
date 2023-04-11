package com.tnsComparator;

import java.util.ArrayList;
import java.util.Collections;


public class Demo {
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(222,"bbb","bang"));
		st.add(new Student(232,"aaa","mys"));
		st.add(new Student(322,"ccc","delhi"));
		System.out.println(st);
		System.out.println("Unsorted Array");
		for (int i=0; i<st.size();i++) {
			System.out.println(st.get(i));
			System.out.println("------------------");
			Collections.sort(st,new SortbyRollno());
			System.out.println("Sorting rollno");
			for (int l=0; l<st.size();l++) 
				System.out.println(st.get(l));
			Collections.sort(st,new SortbyName());
			System.out.println("Sorting Name");
			for (int l=0; l<st.size();l++) 
				System.out.println(st.get(l));
		}
	}

}
