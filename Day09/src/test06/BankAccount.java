package test06;

public class BankAccount {
	private String owner;
	private int accountNumber;
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
}
