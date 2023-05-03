package com.tnsStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Specify the source using the List
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(9);
		numbers.add(26);
		//numbers.add(35);
		System.out.println(numbers);
	    //Creating the stream by using Stream method
		Stream<Integer> st = numbers.stream();
		
		Set<Integer> set= st.collect(Collectors.toSet());
		System.out.println("Set values are"+set);
		

	}

}
