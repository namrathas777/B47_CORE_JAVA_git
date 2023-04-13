package com.tnsMultithreading;

public class SetThreadPriority  extends Thread{
	public void run(){
		System.out.println("Thread "+Thread.currentThread().getName()+" started");
		System.out.println("thread with pirority " + Thread.currentThread().getPriority()+ " is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetThreadPriority t1 = new SetThreadPriority();
		SetThreadPriority t2 = new SetThreadPriority();
		SetThreadPriority t3 = new SetThreadPriority();
		t1.setPriority(5);
		t2.setPriority(2);
		t3.setPriority(3);
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
