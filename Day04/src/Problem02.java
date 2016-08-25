import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = input.nextInt();
		
		boolean mul_2 = (num%2 == 0);
		boolean mul_3 = (num%3 == 0);
		boolean mul_5 = (num%5 == 0);
		
				
		if(mul_2 || mul_3 || mul_5) {
			if (mul_2) {
				System.out.println("입력된 숫자는 2의 배수이다.");
			}
			if (mul_3) {
				System.out.println("입력된 숫자는 3의 배수이다.");
			}
			if (mul_5) {
				System.out.println("입력된 숫자는 5의 배수이다.");
			}
		}
		else {
			System.out.println("입력된 숫자는 2, 3, 5의 배수가 아니다.");
		}
			
	}
}
