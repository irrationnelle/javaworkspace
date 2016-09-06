package bank;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[100]; 

		Scanner scan = new Scanner(System.in);
		
		
		boolean isContinue = true;
		
		while(isContinue) {
			System.out.println("-- 1: 가입 2:입금 3:출금 4:계좌조회 -1:종료 --");
			System.out.print("-- select >");
			int input = scan.nextInt();
			switch(input) {
			case 1:
				// 객체 생성
				System.out.println("가입한다");
				break;
			case 2:
				// setters, getters 사용
				System.out.println("입금한다");
				break;
			case 3:
				// setters, getters 사용
				System.out.println("출금한다");
				break;
			case 4:
				System.out.println("조회한다");
				break;
			case -1:
				isContinue = false;
				break;
			default:
				System.out.println("알맞은 번호를 다시 입력하세요.");
			}
		}
	}
}
