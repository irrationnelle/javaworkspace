import java.util.Scanner;

public class Notepad10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = input.nextInt();		
		int total = 0;
		
		while(num > 0) {
			total += (num%10);
			num = num/10;			
		}
		
		System.out.println("sum: "+total);
	}
}
