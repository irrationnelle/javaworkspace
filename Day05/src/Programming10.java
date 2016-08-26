import java.util.Scanner;

public class Programming10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input number: ");
		int num = input.nextInt();
		
		long a = 0, b = 1, c;
		
		
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<=(num-3); i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
		
	}
}
