import java.util.Scanner;

public class Programming01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first, second, third;
//		int swap;
		
		System.out.print("input first number: ");
		int num1 = input.nextInt();
		
		System.out.print("input second number: ");
		int num2 = input.nextInt();
		
		System.out.print("input third number: ");
		int num3 = input.nextInt();

		if(num2 > num1) {
			first = num1;
			second = num2;
		}
		else {
			first = num2;
			second = num1;
		}
		
		if(num3>second) {
			third = num3;	
		}
		else if(num3<first) {
			third = second;
			second = first;
			first = num3;			
		}
		else {
			third = second;
			second = num3;
		}
		
		System.out.println(first+" "+second+" "+third);

	}
}
