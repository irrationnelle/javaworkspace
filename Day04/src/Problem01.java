import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input first number: ");
		int num1 = input.nextInt();
		
		System.out.print("input second number: ");
		int num2 = input.nextInt();
		
		System.out.println("input calculator mode: ");
		int mode = input.nextInt();
		
		if(mode == 1) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(mode == 2) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(mode == 3) {
			System.out.println(num1+"x"+num2+"="+(num1*num2));
		}
		else if(mode == 4) {
			if(num2 == 0) {
				System.out.println("Incorrect!");
			}
			else {
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
		}
		else if(mode == 5) {
			System.out.println(num1+"%"+num2+"="+(num1%num2));
		}
		else {
			System.out.println("Incorrect!");
		}
			
	}
}
