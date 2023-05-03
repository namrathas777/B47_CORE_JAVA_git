package com.tnsStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamoper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Source in the form of array
List<String> gseven= Arrays.asList("USA","JAPAN","FRANCE");
System.out.println(gseven);
for (String i: gseven) {
	System.out.println(i);
}
//create a stream
Stream<String> gsevencountries = gseven.stream();
Stream <String>hai = gsevencountries.map(x->x.toLowerCase());
//terminal operation
String terminal = hai.collect(Collectors.joining(","));
System.out.println(terminal);
	}

}
