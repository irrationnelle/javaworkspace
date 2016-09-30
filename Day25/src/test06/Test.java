package test06;

public class Test {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		User u1 = new User(account);
		User u2 = new User(account);
		
		u1.start();
		u2.start();
	}
}
