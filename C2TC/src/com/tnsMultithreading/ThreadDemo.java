package com.tnsMultithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		/*CreatingThreadOne t = new CreatingThreadOne();//new State
		t.start();//implicit
		t.run();//explicit
		t.start();*/
		CreatingThreadSecond mc = new CreatingThreadSecond();
		Thread t = new Thread(mc);
		mc.run();
		}

}
