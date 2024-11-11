package com.psl.training;
class Bank{
	private int balance;
	private int accountNO;
	public Bank(int balance, int accountNO) {
		super();
		this.balance = balance;
		this.accountNO = accountNO;
	}
	
	public void withdraw(int amount) throws InsufficientBalance {
		if(balance<amount) {
			throw new InsufficientBalance("Balance is not sufficient to perform withdraw operation");//we can also not to pass this message
		}
		else {
			balance=balance-amount;
		}
	}
}
public class UserDefinedException {

	public static void main(String[] args) throws InsufficientBalance {
		Bank bank=new Bank(20_000,12345);
		bank.withdraw(30_000);

	}

}
