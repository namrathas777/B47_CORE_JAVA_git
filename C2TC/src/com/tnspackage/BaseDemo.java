package com.tnspackage;
import com.tnspackage.Base;
public class BaseDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Base b =new Base();
			b.methodDefault();
			b.methodProtected();
			b.methodPublic();
			//b.methodPrivate() cannot access outside the class
			
			b.varDefault=21;
			b.methodDefault();
		    /*
		     * b.varDefault=21;
			   b.methodDefault();

		     */
			b.varPublic=65;
			b.methodPublic();
			System.out.println(b instanceof Base);

		}

	}
