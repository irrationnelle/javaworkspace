import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = input.nextInt();
		
		boolean mul_2 = (num%2 == 0);
		boolean mul_3 = (num%3 == 0);
		boolean mul_5 = (num%5 == 0);
		
				
		if(mul_2 || mul_3 || mul_5) {
			if (mul_2) {
				System.out.println("�Էµ� ���ڴ� 2�� ����̴�.");
			}
			if (mul_3) {
				System.out.println("�Էµ� ���ڴ� 3�� ����̴�.");
			}
			if (mul_5) {
				System.out.println("�Էµ� ���ڴ� 5�� ����̴�.");
			}
		}
		else {
			System.out.println("�Էµ� ���ڴ� 2, 3, 5�� ����� �ƴϴ�.");
		}
			
	}
}
