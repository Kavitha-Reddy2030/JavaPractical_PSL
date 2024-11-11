package com.psl.training;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			//System.out.println("Current thread executing is: " + currentThread().getName());// getname gives only which
																							// thread but no priority it
			Thread.yield();																		// gives
			System.out.println("MyThread: " + i);
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		}
	}
}

class RunnableThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			//System.out.println("Current thread executing is: " + currentThread());
			System.out.println("RunnableThread: " + i);
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		}
	}
}

public class Methods {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread runnable = new Thread(new RunnableThread1());
		myThread.start();
		runnable.setName("Mine");// setting the name for thread By default it is thread0 thread1 ....
		runnable.start();
		try {
			myThread.join();//It stops its execution and make other thread to finish its execution and then this thread starts its execution
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
