package com.tnsSYNC;

public class MethodSync implements Runnable {
	int tickets;
    int i;
    void bookticket(String name ,int wantedtickets) {
	if (wantedtickets<=tickets ) {
		System.out.println(wantedtickets +" I booked to "+ name );
		tickets=tickets=wantedtickets;
	}
	else {
		System.out.println("no tickets booked");
	}
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name =Thread.currentThread().getName();
		System.out.println("current thread is "+name);
		if (name.equals("first thread")) {
			bookticket(name,i);
		}
		else if(name.equals("second thread")) {
			bookticket(name,i);
		}
		else {
			bookticket(name,i);
		}
		
	}

}
