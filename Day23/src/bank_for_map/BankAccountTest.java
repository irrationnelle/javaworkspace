package bank_for_map;

import java.util.HashMap;
import java.util.Scanner;

public class BankAccountTest {
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<Integer, BankAccount> bankAccount = new HashMap<Integer, BankAccount>();

		Scanner scan = new Scanner(System.in);
		
		boolean isContinue = true;
		
		while(isContinue) {
			System.out.println("-- 1: ���� 2:�Ա� 3:��� 4:������ȸ -1:���� --");
			System.out.print("-- select >");
			int input = scan.nextInt();
			int i=0;
			int account;
			String checkPassword;
			boolean isCorrect = false;
			switch(input) {
			case 1: // ��ü(����) ����
				System.out.print("�̸��� �Է��ϼ���: ");
				String name = scan.next();
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				String password = scan.next();
				System.out.print("�ʱ�ݾ��� �Է��ϼ���: ");
				int initAmount = scan.nextInt();
				/*
				 * customerCounts ������ �̿��Ͽ� accounts[n]��
				 * n�� ���� �ʱ�ȭ���� �� �ִ�.
				 */
				bankAccount.put(BankAccount.accountNum, new BankAccount(name, password, initAmount));
				break;
			case 2: // �Ա�
				account = checkAccount();
				checkPassword = checkPassword();
				/*
				 * ���� while������ accounts[i]�� null���� �˻��� �ʿ� ����
				 * BankAccount class���� static������ customerCounts�� �������ְ�
				 * �����ڿ� customerCounts++;�� ���ָ�
				 * ���߿� for���� ���� �� customerCounts�� �̿��� �� �ִ�. 
				 */
				try {
					if (checkPassword.equals(bankAccount.get(account).getPassword())) {
						System.out.print("�Ա� �ݾ�: ");
						int depositAmount = scan.nextInt();
						bankAccount.get(account).deposit(depositAmount);
						isCorrect = true;
					}
				} catch (NullPointerException e) {
					System.out.println("�߸��� ���¹�ȣ Ȥ�� ��й�ȣ�Դϴ�.");
					break;
				}
				/*
				 * customerCounts�� i���̶� ���ؼ�
				 * �Ʒ� if���� �߸��� ���¹�ȣ�� ��½�ų �� �ִ�.
				 * �ֳĸ� �ش� ���¸� customerCounts��ŭ ã�µ�
				 * ��ã�Ҵٴ� ���� ���� �����̱� ������
				 * if(customerCounts == i)�� ã�� �� �ִ�.
				 */
				if(isCorrect) {
					break;
				} else {
					System.out.println("�߸��� ���¹�ȣ Ȥ�� ��й�ȣ�Դϴ�.");
					break;
				}
			case 3: // ���
				account = checkAccount();
				checkPassword = checkPassword();
				try {
					if(checkPassword.equals(bankAccount.get(account).getPassword())) {
						System.out.print("��� �ݾ�: ");
						int withdrawAmount = scan.nextInt();
						bankAccount.get(account).withdraw(withdrawAmount);
						isCorrect = true;
					}
				} catch (NullPointerException e) {
					System.out.println("�߸��� ���¹�ȣ Ȥ�� ��й�ȣ�Դϴ�.");
					break;
				}
				if(isCorrect) {
					break;
				} else {
					System.out.println("�߸��� ���¹�ȣ Ȥ�� ��й�ȣ�Դϴ�.");
					break;
				}
			case 4: // ��ȸ
				account = checkAccount();
				checkPassword = checkPassword();
				try {
					if(checkPassword.equals(bankAccount.get(account).getPassword())) {
						bankAccount.get(account).checkAccout();
						isCorrect = true;
					}
				} catch (NullPointerException e) {
					System.out.println("�߸��� ���¹�ȣ Ȥ�� ��й�ȣ�Դϴ�.");
					break;
				}
				if(isCorrect) {
					break;
				} else {
					System.out.println("�߸��� ���¹�ȣ Ȥ�� ��й�ȣ�Դϴ�.");
					break;
				}
			case -1: // ���α׷� ����
				isContinue = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default: // ���Է�
				System.out.println("�˸��� ��ȣ�� �ٽ� �Է��ϼ���.");
			}
		}
	}

	public static int checkAccount() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���¹�ȣ�� �Է��ϼ���: ");
		int account = scan.nextInt();
		return account;
	}
	
	public static String checkPassword() {
		Scanner scan = new Scanner(System.in);
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
		String password = scan.next();
		return password;
	}
	
}
