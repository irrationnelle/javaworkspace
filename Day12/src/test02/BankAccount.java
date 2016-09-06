package test02;

public class BankAccount {
	private int balance; // �ܾ� ���� ����
	private String ownerName; // ������ �̸�
	private String accountNum; // ���¹�ȣ
	
	public BankAccount(int initMoney, String name, String acNum) {
		this.setBalance(initMoney);
		this.setOwnerName(name);
		this.setAccountNum(acNum);
	}

	//getters and setters
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	//�޼ҵ�
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			System.out.println("��� �Ϸ�");
		} else {
			System.out.println("�ܾ� ����");
			
		}
	}
	
	public void printAccount() {
		System.out.println("*********************");
		System.out.println("������: "+ownerName);
		System.out.println("���¹�ȣ: "+accountNum);
		System.out.println("�ܾ�: "+balance);
		System.out.println("*********************");
	}
	
	public void transfer(BankAccount other, int money) {
		if(balance >= money) {
			this.withdraw(money); // ���� ���¿����� ���
			other.deposit(money); // ���޹��� �ּ��� ���� ��ü�� �Ա�
			System.out.println("�۱� �Ϸ�");
		} else {
			System.out.println("�۱� �ܾ� ����");
		}
	}
	
}
