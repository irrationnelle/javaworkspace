package bank;

public class BankAccount {
	private String name;
	private String password;
	private int balance;
	private int account;
	public static int accountNum = 11111;
	
	
	public void signUp() {
		System.out.print("�̸��� �Է��ϼ���: ");
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		this.account = accountNum++;
	}
	
	public void deposit() {
		System.out.print("���¹�ȣ�� �Է��ϼ���: ");
		System.out.print("�Ա� �ݾ�: ");
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void withdraw() {
		System.out.print("���¹�ȣ�� �Է��ϼ���: ");
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
		System.out.print("��� �ݾ�: ");
		System.out.println("����� �Ϸ�Ǿ����ϴ�: ");
	}
	
	public void checkAccout() {
		System.out.print("���¹�ȣ�� �Է��ϼ���: ");
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
		System.out.println("������: "+this.name);
		System.out.println("���¹�ȣ: "+this.accountNum);
		System.out.println("���� �ܾ�: "+this.balance);
		
	}
}
