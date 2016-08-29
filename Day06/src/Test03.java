import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int num;

		do {
			System.out.print("10000보다 작은 정수 입력: ");
			num = input.nextInt();
			
			if(num >= 10000) {
				System.out.println("10000보다 작은 정수를 입력해야 합니다!");
				continue;
			}
		} while(num >= 10000);
		
		int cipher = 1000;
		for(int i=0; i<4; i++) {
			System.out.println(cipher+"의 자리: "+(num/cipher));
			num %= cipher;
			cipher /= 10;
		}
	}
}
