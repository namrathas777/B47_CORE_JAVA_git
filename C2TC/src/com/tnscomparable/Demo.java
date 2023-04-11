package com.tnscomparable;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop> laps = new ArrayList();
		laps.add(new Laptop("Dell",16,800000));
		laps.add(new Laptop("asus",8,600000));
		laps.add(new Laptop("Apple",19,900000));
		Collections.sort(laps);
		System.out.println(laps);
		for (Laptop l : laps) {
			System.out.println(l);
		}

	}

}
