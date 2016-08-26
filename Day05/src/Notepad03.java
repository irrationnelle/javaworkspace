import java.util.Scanner;

public class Notepad03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.print("input number: ");
		int num = input.nextInt();
		
		int count = 0;
		while (true) {
			num = num / 10;
			count++;
			if (num == 0) {
				break;
			}
		}

		System.out.println(count);
	}
}
