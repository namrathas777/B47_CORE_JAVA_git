package com.tnsMultithreading;

public class Sender extends Thread {
	public void sendMessage(String message) {
		System.out.println("\n sending "+message);
		try {
			Thread.sleep(1000);
			
		}
		catch(Exception e) {
			System.out.println("thread interrupted");
		}
		System.out.println("\n"+message +"sent");
	}

}
