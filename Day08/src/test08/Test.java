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
		�� ��� ���� ���� b[i]�� 3�� ������� ���̰�,
		���� ���� b[i]�� �����ϴ� ��ü�� ���� ��������� �ʾҴ�.
		���� ������ ���� ���� b[i]�� null�� �Ҵ� �޴´�.

		���� b[i] = new BankAccount(); �� ��ü�� �ּҿ� �Ҵ����ش�.
		 */
		
		for(int i=0; i<b.length; i++) {
			b[i] = new BankAccount();
		}
		
		for(int i=0; i<b.length; i++) {
			b[i].balance = 1000;
		}
		
	}
}
