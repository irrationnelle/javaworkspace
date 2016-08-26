import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = input.nextInt();
		
		for (int i=9; i>0; i--) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
		
	}
}
