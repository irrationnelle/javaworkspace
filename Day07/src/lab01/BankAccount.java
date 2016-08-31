package lab01;

public class BankAccount {
	int balance;
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		if(balance>=amount) {
			balance -= amount;
		}
		else {
			System.out.println("Fail to withdraw!");
		}
	}
	
	void addInterest() {
		final double INTEREST = (double)75/(double)1000;
		balance = balance + (int) (balance*INTEREST);
	}
	
	int getBalance() {
		return balance;
	}
}
