package com.psl.training;

public class Bank {
	//Data hiding since the field is private
	private int balance = 30_000; // The way to provide instead of comma for 30,000

	public int getBalance() {
		return balance;
	}
	
	//Deposit operation where we changed the logic of setter method
	public void setBalance(int balance) {
		//this refers to current class balance i.e 30000
		//balance refers to formal variable  i.e 20000
		this.balance = balance; 
	}
	//In general the best practice is to not to modify getter setter logic
	//Better to provide the required logic in new method
	public void deposit(int amount) {
		int final_balance=this.balance+amount;
		this.setBalance(final_balance);
	}

}
