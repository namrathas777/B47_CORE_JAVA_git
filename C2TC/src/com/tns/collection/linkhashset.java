package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class linkhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ordered , unordered set
LinkedHashSet<Integer> lset = new LinkedHashSet<Integer> ();
lset.add(10);
lset.add(70);
lset.add(30);
lset.add(40);
lset.add(00);
lset.add(70);
System.out.println(lset);
//Collections.sort(lset);

//sort using ArrayList/TreeList
//Convert LinkedHashSet into ArrayList
ArrayList<Integer> array = new ArrayList<>(lset);
//sort ArrayList
Collections.sort(array);
//print after sort
System.out.println("After sort : "+ array);


	}

}
