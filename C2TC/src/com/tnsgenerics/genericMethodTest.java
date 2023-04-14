package com.tnsgenerics;

public class genericMethodTest {
	public<E> void displayArrayElements(E[] elements) {
		for (E ele : elements) {
			System.out.println("elements are "+ele);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericMethodTest obj = new genericMethodTest();
        Integer[] intarr= {10,20,30};
        String[] strarr= {"Java","Program"};
        obj.displayArrayElements(intarr);
        obj.displayArrayElements(strarr);

        
	}

}
