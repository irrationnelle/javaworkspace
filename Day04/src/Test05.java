import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = input.nextInt();
		
		if (num%2 == 0) {
			System.out.println("This is even number");
		}
		else {
			System.out.println("This is odd number");
		}
			
	}
}
