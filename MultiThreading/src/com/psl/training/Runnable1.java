package com.psl.training;

public class Runnable1 implements Runnable{

	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable1());
		thread.start();
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread: "+i);
		}
		
	}

}
