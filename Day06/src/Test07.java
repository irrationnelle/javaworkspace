import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("정수 입력: ");
			num = input.nextInt();
			if(num < 0) {
				System.out.println("0보다 큰 정수를 입력하세요!");
			}
		} while(num < 0);

		for(int i=1; i<=num; i++) {
			if(i%3 == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
