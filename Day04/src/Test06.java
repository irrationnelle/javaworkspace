import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int number = input.nextInt();
		
		switch (number) {
		case 1 :
			System.out.println("You typed 1");
			break;
		case 2 :
			System.out.println("You typed 2");
			
		default:
			System.out.println("You typed something");
		}
	}
}
