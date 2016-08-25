import java.util.Scanner;

public class Table01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input first number: ");
		int num1 = input.nextInt();
		
		System.out.print("input second number: ");
		int num2 = input.nextInt();
		
		
		if (num1 == 0 || num2 == 0) {
			System.out.println("You cannot use 0 for dividing");
		}		
		else {
			if(num1>num2) {
				int quotient = num1/num2;
				int remainder = num1%num2;
				System.out.println(num1+"/"+num2+"=");
				System.out.println("Quotient: "+quotient);
				System.out.println("Remainder: "+remainder);
			}
			else if(num2>num1) {
				int quotient = num2/num1;
				int remainder = num2%num1;
				System.out.println(num2+"/"+num1+"=");
				System.out.println("Quotient: "+quotient);
				System.out.println("Remainder: "+remainder);
			}
						
		}
		
	}
}
