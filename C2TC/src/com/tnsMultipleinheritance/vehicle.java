package com.tnsMultipleinheritance;
import com.tnsMultipleinheritance.vehcileone;
import com.tnsMultipleinheritance.vehciletwo;

public class vehicle implements vehcileone,vehciletwo  {

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		int speed =distance/100;
	}

	@Override
	public void distance() {
		// TODO Auto-generated method stub
		int distance =speed*100;
		System.out.println("distancetravelled"+distance);
		
	}

}