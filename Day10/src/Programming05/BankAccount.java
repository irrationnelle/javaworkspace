package Programming05;

public class BankAccount {
	private String name;
	private String accountNum;
	private int balance;
	private double interest;
	
	public BankAccount(String name, String accountNum) {
		this.name = name;
		this.accountNum = accountNum;
		balance = 0;
	}
	
	public BankAccount() {
		this("¼³Çö", "12345678");
	}
}
