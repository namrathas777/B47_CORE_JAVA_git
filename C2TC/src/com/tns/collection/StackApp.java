package com.tns.collection;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> obj = new Stack<Integer>();
obj.push(0);
obj.push(1);
obj.push(2);
obj.push(3);
obj.push(100);
obj.push(66);
obj.push(14);
System.out.println(obj);
obj.pop();
obj.pop();//last Element is removed
System.out.println(obj);
for (int temp:obj) {
	System.out.println(obj);
}
System.out.println("last element is "+obj.peek());
if(obj.isEmpty()) {
	System.out.println("Stack empty");
}
else {
	System.out.println("Stack not empty");

}
System.out.println(obj.search(0));
System.out.println(obj.search(100));
	
		
	}

}
