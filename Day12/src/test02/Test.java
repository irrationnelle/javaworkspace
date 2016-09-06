package test02;

public class Test {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(10000, "Rase", "1234");
		BankAccount account2 = new BankAccount(1000, "Tyr", "4321");
		
		int money = 500;
		account1.transfer(account2, money);
		
		account1.printAccount();
		account2.printAccount();
		
	}
	
	
}
