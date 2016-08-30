import java.util.Scanner;

public class Programming07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID 생성: ");
		String setId = scan.nextLine();
		
		System.out.print("PW 생성: ");
		String setPassword = scan.nextLine();
		
		System.out.print("ID 확인: ");
		String id = scan.nextLine();
		
		System.out.print("PW 확인: ");
		String password = scan.nextLine();
		
		if(setId.equals(id)) {
			System.out.println("ID 확인 성공.");
		}
		else {
			System.out.println("ID 확인 실패.");
		}
		
		if(setPassword.equals(password)) {
			System.out.println("PW 확인 성공.");
		}
		else {
			System.out.println("PW 확인 실패.");
		}
	}
}
