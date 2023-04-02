package com.tnsexception;
import java.io.IOException;
//import java.sql.SQLException;

public class throwexc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowDemo.check();
		}
		catch(ArithmeticException e) {
			System.out.println("caught the exc ");
		}
		catch(IOException el) {
			System.out.println("IO exception ");
		}
		/*catch(SQLException sq) {
			sq.printStackTrace();
			System.out.println("SQL Exeption");
		}*/

	}

}
