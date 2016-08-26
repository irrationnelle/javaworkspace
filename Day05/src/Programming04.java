import java.util.Scanner;

public class Programming04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input first integer: ");
		int num1 = input.nextInt();
				
		System.out.print("input second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("input third integer: ");
		int num3 = input.nextInt();
		
		int min=num1;
		if(min > num2) {
			min = num2;
			if(min > num3) {
				min = num3;
			}
		}
		else if(min > num3) {
			min = num3;
		}
		
		System.out.println("The minimum integer is "+min);
	}
}
