package bank;

import java.util.Scanner;

public class BankAccount {
	private String name;
	private String password;
	private int balance;
	private int account;
	public static int accountNum = 11110;
	
	public BankAccount(String name, String password, int initAmount) {
		this.name = name;
		this.setPassword(password);
		this.balance = initAmount;
		this.setAccount(accountNum++);
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		System.out.println("**********���� ����**********");
		this.checkAccout();
	}
	
	public void deposit(int depositAmount) {
		this.balance += depositAmount;
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void withdraw(int withdrawAmount) {
		if(balance >= withdrawAmount) {
			this.balance -= withdrawAmount;
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�: ");
	}
	
	public void checkAccout() {
		System.out.println("������: "+this.name);
		System.out.println("���¹�ȣ: "+this.account);
		System.out.println("���� �ܾ�: "+this.balance);
		
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	/*
	 * ��й�ȣ�� Ȯ���ϴ� boolean�� ��ȯ�ϴ� �޼ҵ带 ���� �� �ִ�.
	 * �޼ҵ� ������ equals�� ����ϰ� 
	 * ���ڷ� �Էµ� ��й�ȣ ���� �޴� ���
	 */
}