package com.psl.training;

public class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread: "+i);
		}
	}
	

	public static void main(String[] args) {
	
		Thread1 t=new Thread1();
		t.start();

	}

}
