import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int num;

		do {
			System.out.print("10000���� ���� ���� �Է�: ");
			num = input.nextInt();
			
			if(num >= 10000) {
				System.out.println("10000���� ���� ������ �Է��ؾ� �մϴ�!");
				continue;
			}
		} while(num >= 10000);
		
		int cipher = 1000;
		for(int i=0; i<4; i++) {
			System.out.println(cipher+"�� �ڸ�: "+(num/cipher));
			num %= cipher;
			cipher /= 10;
		}
	}
}
