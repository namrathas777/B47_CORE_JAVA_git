package com.tnsLamdaExpression;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(222,"bbb","bang"));
		st.add(new Student(232,"aaa","mys"));
		st.add(new Student(322,"ccc","delhi"));
		System.out.println(st);
		System.out.println("Unsorted Array");
		for (int i=0; i<st.size();i++) {
			System.out.println(st.get(i));
			

	}
		//sorted by RollNo
		Comparator <Student> SortbyRollno= (a,b)-> a.getRollNo() -b.getRollNo();
		Collections.sort(st,SortbyRollno);
		System.out.println("sorting by Rollno");
		for (int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}
		Comparator <Student> SortbyName= (a,b)-> a.getName().compareTo(b.getName());
		Collections.sort(st,SortbyName);
		System.out.println("sorting by Name");
		for (int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}
	}
}
