import java.util.Scanner;

public class Notepad07 {
	public static void main(String[] args) {
		int total = 0;
		int up = 10;
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "+");
			total += i;
			if (i == up) {
				System.out.println("=" + total);
				up += 10;
				total = 0;
			}
		}

	}
}