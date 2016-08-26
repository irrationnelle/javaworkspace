import java.util.Scanner;

public class Programming05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = input.nextInt();
		
		if(num <= 0) {
			int result = (num*num*num) + (9*num) + 2;
			System.out.println(result);
		}
		else {
			int result = (7*num) + 2;
			System.out.println(result);
		}
	}
}
