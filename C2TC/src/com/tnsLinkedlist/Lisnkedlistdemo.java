package com.tnsLinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class Lisnkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<String> list = new LinkedList<String>(); 
     list.add("manu");
     list.add("carl");
     list.add("Raj");
     System.out.println(list);
     list.addFirst("nagan");
     list.addLast("rick");
     System.out.println(list);
     list.add(2,"glennn");
     list.add(1,"h1");
     System.out.println(list);
     list.remove(2);
     System.out.println(list);
     Iterator it =list.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
	}

}
