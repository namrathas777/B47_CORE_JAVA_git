package com.tnspackage;

public class Base {
		/*
		 * Declaring access Specifiers
		 */
		int varDefault=10;//no access Specifier it is default
		public int varPublic =20;
		private int varPrivate =30;
		protected int varProtected=40;
	    /* 
	     * Declaring access Specifiers to methods
	     */
		void methodDefault() {//default method
			System.out.println("default access base class");
			System.out.println("default variable"+ varDefault );
		}
		
		public void methodPublic() {//default method
			System.out.println("public  access base class");
			System.out.println("default variable"+ varPublic );
		}
		
		private void methodPrivate() {//default method
			System.out.println("Private access base class");
			System.out.println("default variable"+ varPrivate );
		}
		
		protected void methodProtected() {//default method
			System.out.println("protected access base class");
			System.out.println("default variable"+ varProtected );
		}
	}


