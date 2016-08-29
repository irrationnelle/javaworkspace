import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num1 = input.nextInt();
		System.out.print("정수 입력: ");
		int num2 = input.nextInt();
		System.out.print("정수 입력: ");
		int num3 = input.nextInt();
		
		System.out.println("평균값: "+ ((num1+num2+num3)/(double)3));
	}
}
