package com.tnsgenerics;

public class GenericInterfaceDemo implements MyInterfaces <String>{
	@Override
	public String display(String arg) {
		// TODO Auto-generated method stub
		return "Hello " +arg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInterfaceDemo myobj = new GenericInterfaceDemo();
		System.out.println(myobj.display("World"));

	

	
	}

}
