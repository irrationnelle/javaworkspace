import java.util.Scanner;

public class Programming02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final double PI = 3.14159;
		
		while(true) {
			System.out.print("������ �Է�: ");
			int rad = scan.nextInt();
			
			double circleArea = PI*rad*rad;
			System.out.println("���� ����: "+circleArea);
			System.out.print("����Ͻðڽ��ϱ�?(Y/N): ");
			String cond = scan.next();
			cond = cond.toUpperCase();
			
			if((cond.charAt(0) == 'N')) {
				break;
			}
		}

		System.out.println("���α׷� ����.");
		
	}
}
