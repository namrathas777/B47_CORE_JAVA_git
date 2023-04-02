package com.tnspackage;
/*
 * Program to demostrate class and objects encaplusation
 */ 
public class CarClass {
	//Data Members for the class
	int model;
	String color;
	int reg=123;
	int amount=900000;
	//member function for the class
	void forward() {
		System.out.println("Car is moving in forward direction");
	}
	void backward() {
		System.out.println("Car is moving in backward direction");
	}
    void stop(){
    	System.out.println("car is not moving");
    }
}