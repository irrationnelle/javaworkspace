import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		final int RATE = 5000;
		int hours, pay;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your working hours: ");
		hours = input.nextInt();
		
		if(hours > 8) {
			pay = 8*RATE + (int)((hours-8)*1.5*RATE);
		}
		else {
			pay = hours * RATE;
		}
		
		System.out.println("Yours working payment is "+pay);
	}
}
