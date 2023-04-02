package com.tnsInheritance;

public class employee {
	//declare instance vaiable
	private String name;
	private int salary;
	//declare a static variable
	static String companyName="TNS";
	static int id=0;
	employee(){
		id++;
		System.out.println("the id is"+id );
	}
	
	
    employee (String name,int salary){
    	this.name=name;
    	this.salary=salary;
    }


	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + "]";
	}
}
