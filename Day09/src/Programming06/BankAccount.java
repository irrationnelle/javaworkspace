package Programming06;

public class BankAccount {
	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if(balance>=amount) {
			balance -= amount;
		}
		else {
			System.out.println("Fail to withdraw!");
		}
	}
	
	public void addInterest() {
		final double INTEREST = 0.075;
		balance = balance + (int) (balance*INTEREST);
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int transfer(int amount, BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);
		return balance;
	}
}
