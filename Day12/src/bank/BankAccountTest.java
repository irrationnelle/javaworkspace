package bank;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[100]; 

		Scanner scan = new Scanner(System.in);
		
		
		boolean isContinue = true;
		
		while(isContinue) {
			System.out.println("-- 1: ���� 2:�Ա� 3:��� 4:������ȸ -1:���� --");
			System.out.print("-- select >");
			int input = scan.nextInt();
			switch(input) {
			case 1:
				// ��ü ����
				System.out.println("�����Ѵ�");
				break;
			case 2:
				// setters, getters ���
				System.out.println("�Ա��Ѵ�");
				break;
			case 3:
				// setters, getters ���
				System.out.println("����Ѵ�");
				break;
			case 4:
				System.out.println("��ȸ�Ѵ�");
				break;
			case -1:
				isContinue = false;
				break;
			default:
				System.out.println("�˸��� ��ȣ�� �ٽ� �Է��ϼ���.");
			}
		}
	}
}
