package com.tnsgenerics;

public class GenericTest <T> {
	T obj;//generic object
	void add(T obj) {//passed generic obj to the function
		this.obj=obj;
	}
	T get() {//generic method
		return obj;
	}
}
	
