import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input first number: ");
		int num1 = input.nextInt();
		
		System.out.print("input second number: ");
		int num2 = input.nextInt();
		
		if (num2 == 0) {
			System.out.println(0);
		}
		else {
			int quotient = num1/num2;
			int remainder = num1%num2;
			
			System.out.println("Quotient: "+quotient);
			System.out.println("Remainder: "+remainder);
		}
	}
}
