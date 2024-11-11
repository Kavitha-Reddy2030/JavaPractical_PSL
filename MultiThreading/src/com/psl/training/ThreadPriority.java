package com.psl.training;

class Thread3 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread: " + i);
		}
	}
}

class Thread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("RunnableThread: " + i);
		}
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		Thread3 myThread = new Thread3();
		Thread runnable = new Thread(new Thread2());
		myThread.setPriority(Thread.MAX_PRIORITY);
		runnable.setPriority(3);
		
		myThread.start();
		runnable.start();
	}

}
