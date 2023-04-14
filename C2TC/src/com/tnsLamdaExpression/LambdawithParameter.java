package com.tnsLamdaExpression;

public class LambdawithParameter {
	public static void main(String[] args) {
	  int x=5;
	   cube c=(int a)->{return(a*a*a);};
	  int res =c.calculate(x);
	  System.out.println(res);
	}
	

}
