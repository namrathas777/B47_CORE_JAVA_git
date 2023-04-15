package com.tnsMultiThread;

public class MultiThread  extends Thread{
	//declare a String variable to represent task
	String task;
	MultiThread(String task){
		this.task=task;		
	}
	public void run() {
		for (int i =1;i<=7;i++)
		{
			System.out.println(task + " : "+ i);
			System.out.println("Ticket  "+ i +" Is filled plz move to next one thank you");
//			Thread.sleep(5);
			try {
				Thread.sleep(1000);

	
				//pause the thread exceution for 1000 millisecond
			}
			catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}//end of for loop
		
	}//end of run() method
	public static void main(String[] args)
	{//create two object to represent two tasks
		MultiThread th1 =new MultiThread("cut the ticket");//passing the ticket
		MultiThread th2 =new MultiThread("Show your seat number");
		
		//create two objects of thread class and pass two object as parameter 
		//Thread t1= new Thread (th1);
	    //Thread t2 = new Thread(th2);
		th1.start();

		th2.start();
	}

}
