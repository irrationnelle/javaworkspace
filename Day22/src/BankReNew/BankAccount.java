package BankReNew;

public class BankAccount {
	public String _name;
	public int _password;
	public int _amount;
	public static int _accountNum = 1001;
	
	public BankAccount(String name, int password, int amount) {
		// TODO Auto-generated constructor stub
		_name = name;
		_password = password;
		_amount = amount;
	}
}
