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
			System.out.println("-- 1: 가입 2:입금 3:출금 4:계좌조회 -1:종료 --");
			System.out.print("-- select >");
			int input = scan.nextInt();
			int i=0;
			int account;
			String checkPassword;
			boolean isCorrect = false;
			switch(input) {
			case 1: // 객체(계좌) 생성
				System.out.print("이름을 입력하세요: ");
				String name = scan.next();
				System.out.print("비밀번호를 입력하세요: ");
				String password = scan.next();
				System.out.print("초기금액을 입력하세요: ");
				int initAmount = scan.nextInt();
				/*
				 * customerCounts 변수를 이용하여 accounts[n]의
				 * n의 값을 초기화해줄 수 있다.
				 */
				bankAccount.put(BankAccount.accountNum, new BankAccount(name, password, initAmount));
				break;
			case 2: // 입금
				account = checkAccount();
				checkPassword = checkPassword();
				/*
				 * 굳이 while문으로 accounts[i]가 null인지 검사할 필요 없이
				 * BankAccount class에서 static변수로 customerCounts를 선언해주고
				 * 생성자에 customerCounts++;를 해주면
				 * 나중에 for문을 돌릴 때 customerCounts를 이용할 수 있다. 
				 */
				try {
					if (checkPassword.equals(bankAccount.get(account).getPassword())) {
						System.out.print("입금 금액: ");
						int depositAmount = scan.nextInt();
						bankAccount.get(account).deposit(depositAmount);
						isCorrect = true;
					}
				} catch (NullPointerException e) {
					System.out.println("잘못된 계좌번호 혹은 비밀번호입니다.");
					break;
				}
				/*
				 * customerCounts를 i값이랑 비교해서
				 * 아래 if문의 잘못된 계좌번호를 출력시킬 수 있다.
				 * 왜냐면 해당 계좌를 customerCounts만큼 찾는데
				 * 못찾았다는 것은 없는 계좌이기 때문에
				 * if(customerCounts == i)로 찾을 수 있다.
				 */
				if(isCorrect) {
					break;
				} else {
					System.out.println("잘못된 계좌번호 혹은 비밀번호입니다.");
					break;
				}
			case 3: // 출금
				account = checkAccount();
				checkPassword = checkPassword();
				try {
					if(checkPassword.equals(bankAccount.get(account).getPassword())) {
						System.out.print("출금 금액: ");
						int withdrawAmount = scan.nextInt();
						bankAccount.get(account).withdraw(withdrawAmount);
						isCorrect = true;
					}
				} catch (NullPointerException e) {
					System.out.println("잘못된 계좌번호 혹은 비밀번호입니다.");
					break;
				}
				if(isCorrect) {
					break;
				} else {
					System.out.println("잘못된 계좌번호 혹은 비밀번호입니다.");
					break;
				}
			case 4: // 조회
				account = checkAccount();
				checkPassword = checkPassword();
				try {
					if(checkPassword.equals(bankAccount.get(account).getPassword())) {
						bankAccount.get(account).checkAccout();
						isCorrect = true;
					}
				} catch (NullPointerException e) {
					System.out.println("잘못된 계좌번호 혹은 비밀번호입니다.");
					break;
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

	public static int checkAccount() {
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌번호를 입력하세요: ");
		int account = scan.nextInt();
		return account;
	}
	
	public static String checkPassword() {
		Scanner scan = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요: ");
		String password = scan.next();
		return password;
	}
	
}
