package com.tns.collection;
import java.util.ArrayList;
public class ArrDemo 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an array list

		ArrayList<String> dbit = new ArrayList<String>();
		System.out.println(dbit);//displaying the ArrayList
		dbit.add("namratha");
		dbit.add(null);
		dbit.add("semma");
		dbit.add("nammu");
		System.out.println(dbit);
		dbit.remove(1);
		System.out.println(dbit);
		//traversing the list
		for (String elv:dbit) {
			System.out.println(elv);
			
			
		System.out.println("total elements"+dbit.size());
		
		}
	}
		

}
