package test06;

public class User extends Thread {
	private BankAccount account;
	
	public User(BankAccount account) {
		this.account = account; // ���°�ü �ּҸ� �޾Ƽ� ����� ����Ŵ.
	}
	
	@Override
	public void run() {
		for(int i=0; i<1000000000; i++) {
			account.deposit(1000);
			account.withdraw(1000);
		}
	}
}
