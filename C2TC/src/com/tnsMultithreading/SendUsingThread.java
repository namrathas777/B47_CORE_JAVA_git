package com.tnsMultithreading;

public class SendUsingThread extends Thread {
	private String message;
	Sender sender;
	
	//Receives a message object and a string message to be sent
	SendUsingThread(String mes, Sender object)
	{
		message = mes;
		sender = object;
	}
	public void run() 
	{
	//Synchronization block
	//this will ensure that only one thread sends a message at a line
		synchronized (sender) 
	    {
		//synchronizing the send object
		sender.sendMessage(message);
		
	    }
	}

}
