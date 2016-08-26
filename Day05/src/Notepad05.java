import java.util.Scanner;

public class Notepad05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		
		System.out.print("input number: ");
		int num = input.nextInt();
		total += num;
		
		while(num != 0) {
			System.out.print("input number: ");
			num = input.nextInt();
			total += num;
			if(num < 0) {
				continue;
			}
		}
		
		System.out.println(total);
		
	}
}
