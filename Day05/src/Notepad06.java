import java.util.Scanner;

public class Notepad06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("input number: ");
			int num = input.nextInt();
			if (num <= 0) {
				System.out.println("You must type positive number!");
				i--;
				continue;
			}
			total += num;
		}

		System.out.println(total);
	}
}
