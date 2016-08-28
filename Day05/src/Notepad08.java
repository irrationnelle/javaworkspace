import java.util.Scanner;

public class Notepad08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input number: ");
		int num = input.nextInt();

		for (int i = num; i <= (num + 10); i++) {
			System.out.print(i + " ");
		}
	}
}