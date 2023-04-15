package com.tnstreesetuserdefined;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<Student> set = new TreeSet<Student>();
      //set.add(new Student("Sam",450));
      set.add(new Student("Ranaldo",340));
      //set.add(new Student("Daniel",150));
      //set.add(new Student("george",590));
      System.out.println("Increasing order with marks");
      //printing the treeset elements
      for(Student ele: set) {
    	  System.out.println(ele.getName()+ " "+ ele.getMarks());
    	  System.out.println();
      }
      
      
	}

}
