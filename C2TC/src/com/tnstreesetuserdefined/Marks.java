package com.tnstreesetuserdefined;

import java.util.Comparator;

public class Marks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if( o1.getMarks()>o2.getMarks())
			return 1;
		else
			return -1;
	}

}
