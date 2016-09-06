package bank;

public class BankAccount {
	private String name;
	private String password;
	private int balance;
	private int account;
	public static int accountNum = 11111;
	
	
	public void signUp() {
		System.out.print("이름을 입력하세요: ");
		System.out.print("비밀번호를 입력하세요: ");
		System.out.println("회원가입이 완료되었습니다.");
		this.account = accountNum++;
	}
	
	public void deposit() {
		System.out.print("계좌번호를 입력하세요: ");
		System.out.print("입금 금액: ");
		System.out.println("입금이 완료되었습니다.");
	}
	
	public void withdraw() {
		System.out.print("계좌번호를 입력하세요: ");
		System.out.print("비밀번호를 입력하세요: ");
		System.out.print("출금 금액: ");
		System.out.println("출금이 완료되었습니다: ");
	}
	
	public void checkAccout() {
		System.out.print("계좌번호를 입력하세요: ");
		System.out.print("비밀번호를 입력하세요: ");
		System.out.println("계좌주: "+this.name);
		System.out.println("계좌번호: "+this.accountNum);
		System.out.println("현재 잔액: "+this.balance);
		
	}
}
