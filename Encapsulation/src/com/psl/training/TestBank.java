package com.psl.training;

public class TestBank {

	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println("Initial bank balance is:"+bank.getBalance());
		bank.deposit(20_000);
		System.out.println("After updation bank balance is:"+bank.getBalance());
	}

}
