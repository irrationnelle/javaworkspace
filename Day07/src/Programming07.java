import java.util.Scanner;

public class Programming07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID ����: ");
		String setId = scan.nextLine();
		
		System.out.print("PW ����: ");
		String setPassword = scan.nextLine();
		
		System.out.print("ID Ȯ��: ");
		String id = scan.nextLine();
		
		System.out.print("PW Ȯ��: ");
		String password = scan.nextLine();
		
		if(setId.equals(id)) {
			System.out.println("ID Ȯ�� ����.");
		}
		else {
			System.out.println("ID Ȯ�� ����.");
		}
		
		if(setPassword.equals(password)) {
			System.out.println("PW Ȯ�� ����.");
		}
		else {
			System.out.println("PW Ȯ�� ����.");
		}
	}
}
