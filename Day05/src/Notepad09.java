import java.util.Scanner;

public class Notepad09 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = -2;
		int i = 1;
		int total = 0;

		while (total < 100) {
			if (i % 2 == 0) {
				System.out.print(num2 + "+");
				total += num2;
				num2 -= 2;
			} else {
				System.out.print(num1 + "+");
				total += num1;
				num1 += 2;
			}
			i++;
		}

		System.out.println("=" + total);
		System.out.println("to"+(i-1));
	}
}