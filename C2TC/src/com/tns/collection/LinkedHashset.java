package com.tns.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<Integer> set = new LinkedHashSet<>();
	for(int i=0; i<=5;i++) {
		set.add(i);
	}
	for (int i :set) {
		System.out.println(i);
	}
	}

}
