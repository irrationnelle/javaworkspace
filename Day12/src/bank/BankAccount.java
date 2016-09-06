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
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println("**********계좌 정보**********");
		this.checkAccout();
	}
	
	public void deposit(int depositAmount) {
		this.balance += depositAmount;
		System.out.println("입금이 완료되었습니다.");
	}
	
	public void withdraw(int withdrawAmount) {
		if(balance >= withdrawAmount) {
			this.balance -= withdrawAmount;
		} else {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		System.out.println("출금이 완료되었습니다: ");
	}
	
	public void checkAccout() {
		System.out.println("계좌주: "+this.name);
		System.out.println("계좌번호: "+this.account);
		System.out.println("현재 잔액: "+this.balance);
		
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
	 * 비밀번호를 확인하는 boolean을 반환하는 메소드를 만들 수 있다.
	 * 메소드 블럭에서 equals를 사용하고 
	 * 인자로 입력된 비밀번호 값을 받는 방식
	 */
}