import java.util.Scanner;

public class Programming09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("input mode: ");
		char arith = input.next().charAt(0);
		
		System.out.print("input number: ");
		int num1=input.nextInt();
		
		System.out.print("input number: ");
		int num2=input.nextInt();
		
		switch(arith) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			if(num2==0) {
				System.out.println("Incorrect!");
				System.out.println("You cannot use 0 for dividing");
				break;
			}
			System.out.println((double)num1/(double)num2);
			break;
		default:
			System.out.println("End");
			break;
		}
	}
}
