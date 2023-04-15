package com.tnsexception;
import java.io.IOException;
//import java.sql.SQLException;
public class ThrowDemo {
	static void check()throws IOException {
	System.out.println(" Inside check function ");
	//throw new ArithmeticException();
	throw new IOException();
	//throw new SQLException();
	}


}
