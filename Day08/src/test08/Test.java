package test08;

public class Test {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		
		b1.balance = 1000;
		b2.balance = 1000;
		b3.balance = 1000;
		
		BankAccount[] b = new BankAccount[3];
		/*
		 * 
		이 경우 참조 변수 b[i]만 3개 만들어진 것이고,
		참조 변수 b[i]가 참조하는 객체는 아직 만들어지지 않았다.
		따라서 각각의 참조 변수 b[i]는 null을 할당 받는다.

		따라서 b[i] = new BankAccount(); 로 객체의 주소에 할당해준다.
		 */
		
		for(int i=0; i<b.length; i++) {
			b[i] = new BankAccount();
		}
		
		for(int i=0; i<b.length; i++) {
			b[i].balance = 1000;
		}
		
	}
}
