package bank;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[100];

		Scanner scan = new Scanner(System.in);
		
		boolean isContinue = true;
		int accountNum=0;
		
		while(isContinue) {
			System.out.println("-- 1: ���� 2:�Ա� 3:��� 4:������ȸ -1:���� --");
			System.out.print("-- select >");
			int input = scan.nextInt();
			int i=0;
			boolean isCorrect = false;
			int account;
			String checkPassword;
			switch(input) {
			case 1: // ��ü(����) ����
				System.out.print("�̸��� �Է��ϼ���: ");
				String name = scan.next();
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				String password = scan.next();
				System.out.print("�ʱ�ݾ��� �Է��ϼ���: ");
				int initAmount = scan.nextInt();
				accounts[accountNum] = new BankAccount(name, password, initAmount);
				accountNum++;
				break;
			case 2: // �Ա�
				System.out.print("���¹�ȣ�� �Է��ϼ���: ");
				account = scan.nextInt();
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				checkPassword = scan.next();
				while(accounts[i] != null) {
					if((account == accounts[i].getAccount()) && (checkPassword.equals(accounts[i].getPassword()))) {
						System.out.print("�Ա� �ݾ�: ");
						int depositAmount = scan.nextInt();
						accounts[i].deposit(depositAmount);
						isCorrect = true;
						break;
					}
					i++;
				}
				if(isCorrect) {
					break;
				} else {
					System.out.println("�߸��� ���¹�ȣ Ȥ�� ��й�ȣ�Դϴ�.");
					break;
				}
			case 3: // ���
				System.out.print("���¹�ȣ�� �Է��ϼ���: ");
				account = scan.nextInt();
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				checkPassword = scan.next();
				while(accounts[i] != null) {
					if((account == accounts[i].getAccount()) && (checkPassword.equals(accounts[i].getPassword()))) {
						System.out.print("��� �ݾ�: ");
						int withdrawAmount = scan.nextInt();
						accounts[i].withdraw(withdrawAmount);
						isCorrect = true;
						break;
					}
					i++;
				}
				if(isCorrect) {
					break;
				} else {
					System.out.println("�߸��� ���¹�ȣ Ȥ�� ��й�ȣ�Դϴ�.");
					break;
				}
			case 4: // ��ȸ
				System.out.print("���¹�ȣ�� �Է��ϼ���: ");
				account = scan.nextInt();
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				checkPassword = scan.next();
				while(accounts[i] != null) {
					if((account == accounts[i].getAccount()) && (checkPassword.equals(accounts[i].getPassword()))) {
						accounts[i].checkAccout();
						isCorrect = true;
						break;
					}
					i++;
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
}
