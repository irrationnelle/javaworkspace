package Programming06;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		
		b1.deposit(1000);
		b2.deposit(5000);
		
		b1.transfer(500, b2);
		
		System.out.println(b1.getBalance());
		System.out.println(b2.getBalance());
		
		b2.transfer(3000, b1);
		System.out.println(b1.getBalance());
		System.out.println(b2.getBalance());
	}
}
