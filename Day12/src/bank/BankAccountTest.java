package bank;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[100];

		Scanner scan = new Scanner(System.in);
		
		boolean isContinue = true;
		int accountNum=0;
		
		while(isContinue) {
			System.out.println("-- 1: 가입 2:입금 3:출금 4:계좌조회 -1:종료 --");
			System.out.print("-- select >");
			int input = scan.nextInt();
			int i=0;
			boolean isCorrect = false;
			int account;
			String checkPassword;
			switch(input) {
			case 1: // 객체(계좌) 생성
				System.out.print("이름을 입력하세요: ");
				String name = scan.next();
				System.out.print("비밀번호를 입력하세요: ");
				String password = scan.next();
				System.out.print("초기금액을 입력하세요: ");
				int initAmount = scan.nextInt();
				accounts[accountNum] = new BankAccount(name, password, initAmount);
				accountNum++;
				break;
			case 2: // 입금
				System.out.print("계좌번호를 입력하세요: ");
				account = scan.nextInt();
				System.out.print("비밀번호를 입력하세요: ");
				checkPassword = scan.next();
				while(accounts[i] != null) {
					if((account == accounts[i].getAccount()) && (checkPassword.equals(accounts[i].getPassword()))) {
						System.out.print("입금 금액: ");
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
					System.out.println("잘못된 계좌번호 혹은 비밀번호입니다.");
					break;
				}
			case 3: // 출금
				System.out.print("계좌번호를 입력하세요: ");
				account = scan.nextInt();
				System.out.print("비밀번호를 입력하세요: ");
				checkPassword = scan.next();
				while(accounts[i] != null) {
					if((account == accounts[i].getAccount()) && (checkPassword.equals(accounts[i].getPassword()))) {
						System.out.print("출금 금액: ");
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
					System.out.println("잘못된 계좌번호 혹은 비밀번호입니다.");
					break;
				}
			case 4: // 조회
				System.out.print("계좌번호를 입력하세요: ");
				account = scan.nextInt();
				System.out.print("비밀번호를 입력하세요: ");
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
					System.out.println("잘못된 계좌번호 혹은 비밀번호입니다.");
					break;
				}
			case -1: // 프로그램 종료
				isContinue = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default: // 오입력
				System.out.println("알맞은 번호를 다시 입력하세요.");
			}
		}
	}
}
