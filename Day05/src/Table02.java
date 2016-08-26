import java.util.Scanner;

public class Table02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = input.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=1; j<(num-i); j++) {
				System.out.print(" ");
			}			
			for(int j=0; j<(i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
