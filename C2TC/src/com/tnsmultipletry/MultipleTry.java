package com.tnsmultipletry;

public class MultipleTry 
{
	static void except()
	{
		String str ="TNS" ;//declare a string variable
		int x[]= {0,1,2,3,4};//only 5 elements are there
		int slength = str.length();//string length is 3
		int y=3;
		try 
		{//outer try
			str = null;//exception occurred
			System.out.println("String length"+str.length());
			try//inner try block
			{
				int z=x[2]/0;//Arithmetic 
				System.out.println(x[y]);//Exception occured
			}
			catch(ArrayIndexOutOfBoundsException ale)
			{
				System.out.println("Exception is thrown");
				System.out.println(ale.toString());
				
			}
		
		}
	catch(Exception e){
			System.out.println("hi");
		}
	
		
		
	}

}
