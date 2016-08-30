import java.util.Scanner;

public class Programming02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final double PI = 3.14159;
		
		while(true) {
			System.out.print("반지름 입력: ");
			int rad = scan.nextInt();
			
			double circleArea = PI*rad*rad;
			System.out.println("원의 넓이: "+circleArea);
			System.out.print("계속하시겠습니까?(Y/N): ");
			String cond = scan.next();
			cond = cond.toUpperCase();
			
			if((cond.charAt(0) == 'N')) {
				break;
			}
		}

		System.out.println("프로그램 종료.");
		
	}
}
