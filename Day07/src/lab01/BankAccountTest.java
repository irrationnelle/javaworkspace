package lab01;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.balance = 100;
		b.withdraw(60);
		b.withdraw(40);
		
		int current = b.getBalance();
		System.out.println(current);
		
		b.addInterest();
		current = b.getBalance();
		System.out.println(current);
	}
}
