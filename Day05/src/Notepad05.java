import java.util.Scanner;

public class Notepad05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;

		int total = 0;
		do {
			System.out.print("input number: ");
			num = input.nextInt();
			if (num < 0) {
				System.out.println("You must type positive number");
				continue;
			}
			total += num;
		} while (num != 0);

		System.out.println(total);
	}
}
