package com.tns.collection;
import java.util.HashSet;
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a hashset object 
 HashSet<String> set =new HashSet<String>();
 //adding elements to hashset
 set.add("First");
 set.add("Second");
 set.add("Third");
 set.add("Fourth");
 System.out.println("Noorder will be maintained  "+set);
 set.add("First");
 set.add("Second");
 System.out.println("no Duplicate elements "+set);
 set.add(null);
 set.add(null);//ignored
System.out.println("unordered and no dulplicate hashset elements"+set);
System.out.println(set);
}

}
